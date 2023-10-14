package com.example.main;



import com.example.Services.VehicleServices;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.implementation.MichelinTypres;
import com.example.interace.Tyres;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Example13 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        person.setName("Alpha");
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
        System.out.println("Service "+person.getServices()+" for "+person.getServices().moveVehicle());



        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Toyota");
        Supplier<Vehicle> supplierVehicle = new Supplier<Vehicle>() {
            @Override
            public Vehicle get() {
                return vehicle1;
            }
        };

        context.registerBean("Tyres1", Tyres.class, new Supplier<Tyres>() {
            @Override
            public Tyres get() {
                return new MichelinTypres();
            }
        });

        context.registerBean("VehicleServices1", VehicleServices.class, new Supplier<VehicleServices>() {
            @Override
            public VehicleServices get() {
                return new VehicleServices(context.getBean("Tyres1", MichelinTypres.class));
            }
        });

        context.registerBean("Vehicle1", Vehicle.class, supplierVehicle);

        Person person1 = new Person();
        person1.setName("Beta");
        person1.setVehicle(vehicle1);
        person1.setServices(context.getBean("VehicleServices", VehicleServices.class));

//        person1.setServices();
//        person1.setVehicle(vehicle1);

        Supplier<Person> supplierPerson = new Supplier<Person>() {
            @Override
            public Person get() {
                return person1;
            }
        };



        context.registerBean("Person1", Person.class, supplierPerson);

        System.out.println("Person1 name from Spring Context is: " + person1.getName());
        System.out.println("Vehicle1 name from Spring Context is: " + vehicle1.getName());
        System.out.println("Vehicle1 that Person own is: " + person1.getVehicle());
        System.out.println("Service "+person1.getServices()+" for "+person1.getServices().moveVehicle());

    }
}

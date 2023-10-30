package com.example.main;


import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.config.ProjectConfig_WireFromTheFunctions;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class E9{

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        Person person= context.getBean("Person",Person.class);
//        vehicle.setName("Vehicle");

        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());

        System.out.println("Component Person from Spring Context is: " + person.getName());

//        with the way of passing beans through method definition

        var context1 = new AnnotationConfigApplicationContext(ProjectConfig_WireFromTheFunctions.class);
        Vehicle vehicle1 = context1.getBean("Vehicle1",Vehicle.class);

        Person person1= context1.getBean("Person1",Person.class);
//        vehicle.setName("Vehicle");

        System.out.println("Component Vehicle name from Spring Context is: " + vehicle1.getName());

        System.out.println("Component Person from Spring Context is: " + person1.getName());


    }
}

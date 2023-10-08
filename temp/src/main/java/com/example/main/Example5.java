package com.example.main;

import com.example.beans.Ferrari;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5{

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean("Vehicle",Vehicle.class);

        Vehicle ferarri = context.getBean("Ferrari", Ferrari.class);
        vehicle.setName("Vehicle");

        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());

        System.out.println("Component Vehicle name from Spring Context is: " + ferarri.getName());
        vehicle.printHello();

    }
}

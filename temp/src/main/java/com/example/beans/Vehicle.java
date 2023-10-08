package com.example.beans;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Vehicle")
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println(
            "Printing Hello from Component Vehicle Bean");
    }
}

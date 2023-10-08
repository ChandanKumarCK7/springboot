package com.example.beans;


import org.springframework.stereotype.Component;

@Component("Ferrari")
public class Ferrari extends Vehicle {

    public Ferrari(){
        System.out.println("Vehicle bean created by Spring");
    }

    public String name = "Ferrari";

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

    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}

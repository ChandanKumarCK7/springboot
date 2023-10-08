package com.example.beans;





import org.springframework.stereotype.Component;

@Component("Toyota")
public class Toyota extends Vehicle {

    public Toyota(){
        System.out.println("Vehicle bean created by Spring");
    }

    public String name = "Toyota";

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

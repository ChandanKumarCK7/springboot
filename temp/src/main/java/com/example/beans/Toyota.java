package com.example.beans;


import org.springframework.stereotype.Component;

@Component("Toyota")
public class Toyota extends Vehicle {
    public Toyota(){
        setName("toyota");
    }
}

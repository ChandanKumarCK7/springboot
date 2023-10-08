package com.example.beans;


import org.springframework.stereotype.Component;

@Component("Ferrari")
public class Ferrari extends Vehicle {
    public Ferrari(){
        setName("ferarri");
    }
}

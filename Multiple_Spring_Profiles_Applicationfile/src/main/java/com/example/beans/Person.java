package com.example.beans;


import org.springframework.stereotype.Component;


public class Person {
    public Vehicle v;
    public String name;

    public Person(){

    }
    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Vehicle v){
        this.v = v;
    }


}

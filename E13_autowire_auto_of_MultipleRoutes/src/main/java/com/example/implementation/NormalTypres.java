package com.example.implementation;


import com.example.interace.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class NormalTypres implements Tyres {
    @Override
    public String moveVechicle() {
        return "Normal";
    }
}

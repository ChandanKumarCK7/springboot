package com.example.implementation;


import com.example.interace.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTypres implements Tyres {
    @Override
    public String moveVechicle() {
        return "Michelin";
    }
}

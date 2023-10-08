package com.example.Services;


import com.example.interace.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.example.beans.Person;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {


    private Tyres tyres;

    @Autowired
    public VehicleServices(Tyres tyres){
        this.tyres = tyres;
    }

    public String moveVehicle(){
        return tyres.moveVechicle();
    }
}

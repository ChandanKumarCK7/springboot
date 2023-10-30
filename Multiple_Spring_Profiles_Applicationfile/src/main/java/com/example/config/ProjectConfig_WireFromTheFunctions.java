package com.example.config;


import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.beans")
public class ProjectConfig_WireFromTheFunctions {


    @Bean(value="Vehicle1")
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean(value="Person1")
    public Person person(@Qualifier("Vehicle1") Vehicle vehicle){
        Person p = new Person();
        p.setName("Alpha");
        p.setV(vehicle);
        return p;
    }
}

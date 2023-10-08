package practice;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Vehicle{
    String name;
    public void setName(String name ){
        this.name = name;
    }
}
@Configuration
public class NoUniqueBeanExceptionConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle v1 = new Vehicle();
        v1.setName("v1");
    }


    Vehicle v1 = new Vehicle();
    v1.setName("v8");
}

public class NoUniqueBeanException{
    public static void main(String[] args){

    }
}

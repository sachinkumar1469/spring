package in.sachinkr.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    Vehicle(){
        System.out.println("Vehicle constructor called!");
        this.name = "Default Name";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

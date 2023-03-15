package in.sachinkr.beans;

import org.springframework.stereotype.Component;

//@Component
public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle object is created!");
        this.name = "Fortuner";
    }
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

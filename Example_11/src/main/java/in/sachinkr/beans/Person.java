package in.sachinkr.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Person {
    String name;

    @Autowired
    Vehicle vehicle;

    @Autowired
    Vehicle vehicle1;

//    @Autowired
    public Person(){
        System.out.println("Person object is being created!");
//        this.vehicle1 = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Vehicle getVehicle1() {
        return vehicle1;
    }
}

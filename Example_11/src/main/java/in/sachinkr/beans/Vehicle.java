package in.sachinkr.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.beancontext.BeanContext;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Vehicle {
    String name;

    public  Vehicle(){
        System.out.println("Vehicle object is being created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package in.sachinkr.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initializer(){
        this.name = "Initialize name";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Vehicle object is being destroyed");
    }
}

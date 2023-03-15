package in.sachinkr.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    public Person(){
        System.out.println("Person object is created!");
    }
    String name;

    /*
       @Autowired annotation marked on field, setter method or constructor is used to tell spring
       to inject dependency at run time. It will find the bean in spring context container if not
       found it will create that bean according to the configuration and inject it into the another
       bean to form a relationship between them.
    */
    /*
       But using it not recommended in production environment because you can't declare it final
       when using @Autowired annotation also may be sometime you don't want that object, and you
       have already put the null check in you business logic but if you've used @Autowired then
       spring will try to find it and if not found it will throw Exception.
    */
    /*
       To solve the above issue use required attribute
     */

    @Autowired(required = false)
    Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package in.sachinkr.main;

import in.sachinkr.beans.Person;
import in.sachinkr.beans.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person per = context.getBean(Person.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Are they equal "+(per.getVehicle()==veh));
        System.out.println("Hello world!");
    }
}
package in.sachinkr.main;

import in.sachinkr.beans.Person;
import in.sachinkr.beans.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        Person per = context.getBean(Person.class);
        System.out.println(veh==per.getVehicle());
        System.out.println("Hello world!");
    }
}
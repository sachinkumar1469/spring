package in.sachinkr.main;

import in.sachinkr.beans.Person;
import in.sachinkr.beans.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person per = context.getBean(Person.class);
        System.out.println("Name of vehicle is: "+(per.getVehicle().getName()));
        System.out.println("Name of QualifierEx is: "+(per.getQualifierEx().getName()));
        System.out.println("Hello world!");
    }
}
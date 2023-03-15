package in.sachinkr.main;

import in.sachinkr.beans.Person;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Context created but Person bean will not initialized because of @Lazy");
        Person per = context.getBean(Person.class);
        Person per1 = context.getBean(Person.class);
        System.out.println(per==per1);

        // This below statement is used to check the behaviour of prototype beans
        // inside the singleton bean.
        System.out.println(per.getVehicle().hashCode()+" "+ per1.getVehicle1().hashCode());
        System.out.println("Hello world!");
    }
}
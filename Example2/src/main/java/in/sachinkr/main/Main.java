package in.sachinkr.main;

import in.sachinkr.bean.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start\n");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Creating multiple beans of same class with different method name
        // If u try to access bean with just class name it will give run time ambiguity error
        // But if you use @Primary annotation it will not give any kind of error
        var v1 = context.getBean("v1",Vehicle.class);
        System.out.println(v1.getName());

        var v2 = context.getBean("v2", Vehicle.class);
        System.out.println(v2.getName());

        // Example of @Primary annotation
        var v3 = context.getBean(Vehicle.class);
        System.out.println(v3.getName());

        System.out.println("\nEnd");
    }
}

//        Start
//
//        Vehicle 1
//        Vehicle 2
//        Vehicle 3
//
//        End

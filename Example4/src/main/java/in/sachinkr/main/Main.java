package in.sachinkr.main;

import in.sachinkr.beans.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle v1 = context.getBean(Vehicle.class);
        System.out.println(v1.getName());
        context.close();
    }
}
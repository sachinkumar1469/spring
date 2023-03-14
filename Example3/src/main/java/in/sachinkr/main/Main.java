package in.sachinkr.main;


import in.sachinkr.bean.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        Vehicle veh2 = context.getBean(Vehicle.class);
        veh.setName("Tata Harrier");
        System.out.println("Are they same: "+(veh==veh));
        System.out.println(veh.getName());
    }
}
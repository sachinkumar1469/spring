package in.sachinkr.main;

import in.sachinkr.bean.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start\n\n");

        Vehicle myVeh = new Vehicle();
        myVeh.setName("Fortuner");
        System.out.println("Manual vehicle object is: "+myVeh.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle beanVeh = context.getBean(Vehicle.class);
        System.out.println("Context vehicle object is: "+beanVeh.getName());

        Vehicle beanVeh1 = context.getBean(Vehicle.class);
        System.out.println("Are both bean object equal: "+(beanVeh==beanVeh1));

        String helloStr = context.getBean(String.class);
        System.out.println("String context obj is: "+helloStr);

        Integer numberObj = context.getBean(Integer.class);
        System.out.println("Integer context obj is: "+numberObj);


        System.out.println("\n\nEnd");
    }
}
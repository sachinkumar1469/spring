package in.sachinkr.main;

import in.sachinkr.beans.Vehicle;
import in.sachinkr.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        final Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Random random = new Random();
        int randomNum = random.nextInt(10);
        System.out.println("Randon number is: "+randomNum);

        if(randomNum % 2 == 0){
            context.registerBean("volkswagen",Vehicle.class,volkswagenSupplier);
        }else {
            context.registerBean("audi",Vehicle.class,audiSupplier);
        }

        Vehicle randomVehicle = null;

        try{
            randomVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("Volkswagon bean doesn't exist");
            randomVehicle = context.getBean("audi",Vehicle.class);
        };

        System.out.println("Name of final Vehicle is: "+randomVehicle.getName());
    }
}
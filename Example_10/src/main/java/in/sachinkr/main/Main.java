package in.sachinkr.main;

import in.sachinkr.beans.Person;
import in.sachinkr.beans.Vehicle;
import in.sachinkr.beans.VehicleService;
import in.sachinkr.beans.speaker.Speaker;
import in.sachinkr.beans.tyres.Tyre;
import in.sachinkr.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start!\n");
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person per = context.getBean(Person.class);
        per.setName("Sachin Yadav");
        System.out.println(per.getName());

        Vehicle veh = per.getVehicle();
        veh.setName("Fortuner");
        System.out.println("Vehicle name is: "+veh.getName());

        VehicleService vSrv = veh.getVehicleService();
        Tyre tyre = vSrv.getTyre();
        Speaker spk = vSrv.getSpeaker();
        tyre.rotate();
        spk.makeSound();;

        System.out.println("\nEnd!");
    }
}
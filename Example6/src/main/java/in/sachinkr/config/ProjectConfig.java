package in.sachinkr.config;

import in.sachinkr.beans.Person;
import in.sachinkr.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.sachinkr.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Innova Hycross");
        return veh;
    }

    // In person bean we are trying to establish a relationship between
    // person and vehicle object by calling setVehicle and vehicle(bean) methods.
    // This technique is not recommended in production usage.
    // This is kind of manual autowiring.

    // Spring will make sure that only one vehicle bean is created and vehicle bean
    // is created first because person bean is depending on it.
    @Bean
    public Person person(){
        var per = new Person();
        per.setName("Sachin Yadav");
        per.setVehicle(vehicle());
        return per;
    }


}

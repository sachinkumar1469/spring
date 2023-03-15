package in.sachinkr.config;

import in.sachinkr.beans.Person;
import in.sachinkr.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Fortuner");
        return veh;
    }

    // The below example is of method parameter wiring.
    // We are passing an method argument to person method and spring will automatically find
    // the vehicle bean based upon configuration.
    // Spring will inject the vehicle bean into the person bean by using Dependency Injection
    @Bean
    Person person(Vehicle vehicle){
        var per = new Person();
        per.setName("Sachin Yadav");
        per.setVehicle(vehicle);
        return per;
    }
}

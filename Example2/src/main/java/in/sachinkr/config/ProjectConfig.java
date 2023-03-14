package in.sachinkr.config;

import in.sachinkr.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.lang.invoke.VarHandle;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean(value = "v1")
    Vehicle v1(){
        var v = new Vehicle();
        v.setName("Vehicle 1");
        return v;
    }

    @Bean(name = "v2")
    Vehicle v2(){
        var v = new Vehicle();
        v.setName("Vehicle 2");
        return v;
    }

    @Bean("v3")
    Vehicle v3(){
        var v = new Vehicle();
        v.setName("Vehicle 3");
        return v;
    }
}

package in.sachinkr.config;

import in.sachinkr.beans.QualifierEx;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "in.sachinkr.beans")
public class ProjectConfig {

    @Bean("qualiferExBean")
    QualifierEx qualifierEx(){
        var qEx = new QualifierEx();
        qEx.setName("First Bean");
        return qEx;
    }

    @Bean
    QualifierEx qualifierEx2(){
        var qEx = new QualifierEx();
        qEx.setName("Second Bean");
        return qEx;
    }

    @Bean
    @Primary
    QualifierEx qualifierEx3(){
        var qEx = new QualifierEx();
        qEx.setName("Third Bean");
        return qEx;
    }


}

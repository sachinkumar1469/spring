package in.sachinkr.sanschool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfigSecurity{

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{

//        http.authorizeHttpRequests().anyRequest().permitAll()
//                .and().formLogin()
//                .and().httpBasic();

        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/home").permitAll()
                .requestMatchers("/holidays/**").permitAll()
                .requestMatchers("/contact").permitAll()
                .requestMatchers("/about").permitAll()
                .requestMatchers("/saveMsg").permitAll()
                .requestMatchers("/courses").authenticated()
                .requestMatchers("/assets/**").permitAll()
                .and().formLogin().and().httpBasic();

        return http.build();
    }
}

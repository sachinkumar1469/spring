package in.sachinkr.sanschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("in.sachinkr.sanschool.repository")
@EntityScan("in.sachinkr.sanschool.model")
public class SanschoolApplication {

	public static void main(String[] args) {

		SpringApplication.run(SanschoolApplication.class, args);

	}

}

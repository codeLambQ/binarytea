package learning.spring;

import learning.spring.config.BinaryTeaProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BinaryteaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinaryteaApplication.class, args);
    }

}

package inflearn.springboot.example;

import com.example.Example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ExampleApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Bean
    public Example example() {
        Example example = new Example();
        example.setName("name");
        example.setNumber(2L);
        return example;
    }

}

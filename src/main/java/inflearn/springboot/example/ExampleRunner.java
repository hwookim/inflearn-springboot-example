package inflearn.springboot.example;

import com.example.Example;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ExampleRunner implements ApplicationRunner {

    Example example;

    public ExampleRunner(Example example) {
        this.example = example;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(example);
    }
}

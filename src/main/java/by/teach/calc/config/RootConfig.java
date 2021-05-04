package by.teach.calc.config;

import by.teach.calc.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "by.teach.calc")
public class RootConfig {

    @Bean
    public Calculator calculator(Operation operation){
        return new Calculator(operation);
    }

    @Bean
    public Operation operation(){
        return new Multiply();
    }
}

package by.teach.calc.config;

import by.teach.calc.dao.OperationDao;
import by.teach.calc.dao.OperationDaoImpl;
import by.teach.calc.entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "by.teach.calc")
public class RootConfig {

    @Bean
    public Calculator calc(OperationDao dao){
        return new Calculator(dao);
    }

    @Bean
    public Addition add(OperationDao dao){
        return new Addition(dao);
    }

    @Bean
    public OperationDao dao(){
        return new OperationDaoImpl();
    }

}

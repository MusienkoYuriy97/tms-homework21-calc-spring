package by.teach.calc.app;

import by.teach.calc.entity.Calculator;
import by.teach.calc.config.RootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
            Calculator operation = (Calculator) applicationContext.getBean("calculator");
            operation.run();
    }
}

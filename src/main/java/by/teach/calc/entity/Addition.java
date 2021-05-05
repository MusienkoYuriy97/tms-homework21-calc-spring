package by.teach.calc.entity;

import by.teach.calc.dao.OperationDao;
import org.springframework.stereotype.Component;

@Component
public class Addition implements Action {
    private OperationDao dao;

    public Addition(OperationDao dao) {
        this.dao = dao;
    }

    @Override
    public void calculate() {
        double x = ConsoleReader.writeDouble("Enter X: ");
        double y = ConsoleReader.writeDouble("Enter Y: ");
        double result = x + y;
        ConsoleWriter.write(result + " - результат сложения X на Y");
        dao.add(new Operation(x,y,result,"Addition"));
    }
}

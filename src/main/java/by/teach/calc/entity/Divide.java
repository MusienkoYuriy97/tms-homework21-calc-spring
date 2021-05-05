package by.teach.calc.entity;

import by.teach.calc.dao.OperationDao;
import org.springframework.stereotype.Component;

@Component
public class Divide implements Action {
    private OperationDao dao;

    public Divide(OperationDao dao) {
        this.dao = dao;
    }

    @Override
    public void calculate() {
        double x = ConsoleReader.writeDouble("Enter X: ");
        double y = ConsoleReader.writeDouble("Enter Y: ");
        double result = x / y;
        ConsoleWriter.write(result + " - результат деления X на Y");
        dao.add(new Operation(x,y,result,"Divide"));
    }
}

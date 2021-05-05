package by.teach.calc.entity;


import by.teach.calc.dao.OperationDao;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private OperationDao dao;

    public Calculator(OperationDao dao) {
        this.dao = dao;
    }

    public void run() {
        while (true){
            showMenu();
            Action operation = selectOperation();
            if (operation == null){
                break;
            }
            operation.calculate();
        }
        showOperations();
    }

    private Action selectOperation(){
        int ch = ConsoleReader.writeInt("Выберите операцию:");
        switch (ch){
            case 1:
                return new Addition(dao);
            case 2:
                return new Subtract(dao);
            case 3:
                return new Divide(dao);
            case 4:
                return new Multiply(dao);
            case 0:
                return null;
        }
        return selectOperation();
    }

    private void showMenu(){
        ConsoleWriter.write(
                "1 - Сложить (X + Y)",
                "2 - Вычесть (X - Y)",
                "3 - Разделить (X / Y)",
                "4 - Умножить (X * Y)",
                "0 - Выход из программы и вывод истории операций"
                );
    }
    public void showOperations(){
        ConsoleWriter.write("История операций: ");
        for (Operation operation : dao.getOperations()) {
            ConsoleWriter.write(operation);
        }
    }
}

package by.teach.calc.entity;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }
    public void run() {
        while (true){
            operation.calculate();
        }
    }

    private Operation selectOperation(){
        int ch = ConsoleReader.writeInt("Выберите операцию:");
        switch (ch){
            case 1:
                return new Addition();
            case 2:
                return new Subtract();
            case 3:
                return new Divide();
            case 4:
                return new Multiply();
            case 0:
                return null;
        }
        return selectOperation();
    }

    private void showOperations(){
        System.out.println("Выберите операцию: ");
        System.out.println("1 - Сложить (A + B)");
        System.out.println("2 - Вычесть (A - B)");
        System.out.println("3 - Разделить (A / B)");
        System.out.println("4 - Умножить (A * B)");
        System.out.println("0 - Выход из программы");
    }
}

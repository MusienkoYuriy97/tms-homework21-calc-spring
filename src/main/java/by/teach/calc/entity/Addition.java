package by.teach.calc.entity;

public class Addition implements Operation {
    @Override
    public void calculate() {
        double x = ConsoleReader.writeDouble("Enter X: ");
        double y = ConsoleReader.writeDouble("Enter Y: ");
        double result = x + y;
        ConsoleWriter.write(result + " - результат сложения X на Y");
    }
}

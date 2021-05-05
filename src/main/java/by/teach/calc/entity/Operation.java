package by.teach.calc.entity;


public class Operation {
    private double x;
    private double y;
    private double result;
    private String operation;


    public Operation(double x, double y, double result, String operation) {
        this.x = x;
        this.y = y;
        this.result = result;
        this.operation = operation;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "x=" + x +
                ", y=" + y +
                ", result=" + result +
                ", operation='" + operation + '\'' +
                '}';
    }
}

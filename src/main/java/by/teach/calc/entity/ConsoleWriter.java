package by.teach.calc.entity;

public class ConsoleWriter {
    public static void write(Object message) {
        System.out.println(message);
    }
    public static void write(Object... message) {
        for (Object s : message) {
            System.out.println(s);
        }
    }
}

package by.teach.calc.entity;

public class ConsoleWriter {
    public static void write(String message) {
        System.out.println(message);
    }
    public static void write(String... message) {
        for (String s : message) {
            System.out.println(s);
        }
    }
}

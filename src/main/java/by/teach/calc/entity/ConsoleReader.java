package by.teach.calc.entity;

import java.util.Scanner;

public class ConsoleReader {
    public static double writeDouble(String massage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(massage);
        return scanner.nextDouble();
    }
    public static int writeInt(String massage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(massage);
        return scanner.nextInt();
    }
}

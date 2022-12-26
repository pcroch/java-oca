package Oca.HandlingExceptions;

import java.io.FileNotFoundException;

public class Printer {
    public void print() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException enfe) {
            System.out.print("X");
        } finally {
            System.out.print("Y");
        }
    }
    public static void main(String... ink) {
        new Printer().print();
    }
}

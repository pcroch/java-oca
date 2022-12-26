package Oca.Examen3;

public class Question59 {
    public static void main(String[] args) {
        m(1);
    }

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Integer obj) {
        System.out.println("Integer version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }

    private static void m(long obj) {
        System.out.println("Long version");
    }
}

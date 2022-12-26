package Oca.JavaBasics;

public class Tolls {
    private static int yesterday = 1;


    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today = 20, tomorrow = 40;
        System.out.print(today + tomorrow + tolls.tomorrow + tolls.yesterday);
    }
    int tomorrow = 10;
}

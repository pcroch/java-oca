package Oca.Examen2;

public class Question30 {
    public static void main(String [] args) {
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);
    }
}

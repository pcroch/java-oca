package Oca.Examen5;

public class Question12 {
    public static void main(String[] args) {
//        int b = 5;
//        int c = 5;
//        int d = 5;
//        boolean res = b + c++ + d++ == 15;
//        System.out.printf("b = %d, c = %d, d = %d, res = %b", b, c, d, res);
//    }
        int x = 3;
        int y = ++x / 5 * x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}

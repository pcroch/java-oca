package Oca.Examen4;

public class Question37 {
    public static void main(String [] args) {
        int a = 3;
        System.out.println(a++ == 3 || --a == 3 && --a == 3);
        System.out.println(a);
    }
}


//    int x = 3;
//    int b = x++ * 5 ;
//    int a =  x-- + --x;
//              x = 3;
//                      int y = x++ * 5 / x-- + --x;
//                      System.out.println("x is " + x);
//                      System.out.println("y is " + y);
//                      System.out.println("a is " + a);
//                      System.out.println("b is " + b);

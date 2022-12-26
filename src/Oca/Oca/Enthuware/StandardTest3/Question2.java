package Oca.Oca.Enthuware.StandardTest3;

public class Question2 {
    public static void printSum(double a, double b){
        System.out.println("In double "+(a+b));
    }
    public static void printSum(float a, float b){
        System.out.println("In float "+(a+b));
    }

    public static void main(String[] args) {
//        printSum('a');
        printSum(1.0f, 2.0f);
    }
}

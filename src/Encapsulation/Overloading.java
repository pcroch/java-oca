package Encapsulation;

public class Overloading {


    double min(int a, double b) {
        return 5.5;
    }


}

class AfterOverloading extends Overloading { // protected or private or default are not allowed here


    double min(double a, int b) {
        return 5.5;
    }


    public static void testMethod(){};

    public void testMethod1(){};

    public static void main(String... arg) {
        AfterOverloading bb = new AfterOverloading();
//        bb.min(1,2); compilation error
    }
}

package Basics;

public class CastingExample {

    public static void main(String[] args) {
        short short1 = 1;
        short short2 = 3;
        char ch = 1;
        char ch1 = 3;
        int int1 = 4;
                int int2=5;
                int int3=50;
        Integer myInteger= new Integer("999999999");
        Short myShort= new Short((short) 999999999);
//        byte y = (int)short1 + short2 ; // java: incompatible types
//        byte y = (byte) (short1 + short2);
//        System.out.println(y);

        // downcasting
//        char x = (char)(short1+short2);
//        System.out.println(x);
        // upcasting
//        int z = short1+short2;
//        System.out.println(z);
        // other

        char x = '9';
                char y=1;
//        x = x + y; // compile error: "possible loss of precision (found int, required char)"
        y = (char)(x+y); // explicit cast back to char; OK
//        x += y; // compound operation-assignment; also OK
//        System.out.println(y);
        int numericValue = Character.getNumericValue(y);
//        System.out.println(numericValue);

//        myInteger= short1+short2;
//        myInteger= int1*int2;
//        System.out.println(myInteger);
//        myInteger=10;
        int3= (int) myInteger;
        System.out.println(int3);
        short1= (short) myShort;
        System.out.println(short1); // overflowing
//        myInteger= (Integer) myShort;


    }
}

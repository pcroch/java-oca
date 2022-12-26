package Oca.Examen3;

import java.util.Arrays;

public class Question63 {
    public static void main(String[] args) {
        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        System.out.println(new char[] {'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}
//        System.out.println(Arrays.toString(new String[] {"M", "a" , "m","g", "o"}));

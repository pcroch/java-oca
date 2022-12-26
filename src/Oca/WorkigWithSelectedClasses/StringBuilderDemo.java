package Oca.WorkigWithSelectedClasses;

import java.lang.*;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Java Util Package");
        System.out.println("string = " + str);

        // replace substring from index 5 to index 9
        str.replace(5, 9, "Lang");
        str.delete(5, 9000);
        // prints the StringBuilder after replacing
        System.out.println("After replacing: " + str);
    }
}

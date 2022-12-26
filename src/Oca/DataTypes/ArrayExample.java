package Oca.DataTypes;


import java.util.Arrays;
import java.util.List;

public class ArrayExample {

    static int array1[] = new int[8];
    static int array2[][] = new int[8][1];

    static int array3[][]=new int[4][];

    static String array4[] = {"a", "A", "1", "b", "B" , "z", "100", "12", "9", "@", "!" };
    public static void main(String[] args) {
//        array3[0]= new int[5];
        System.out.println(Arrays.toString(array1));
//        System.out.println(array2);
        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(array3[0
//                ]));
        Arrays.sort(array4);
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.binarySearch(array4, " !"));
        System.out.println(Arrays.binarySearch(array4, "!"));
        System.out.println(Arrays.binarySearch(array4, "99"));
    }

}




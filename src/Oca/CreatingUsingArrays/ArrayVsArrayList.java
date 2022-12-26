package Oca.CreatingUsingArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {


    public static void main(String[] args) {
        int ar1[] = {1,2,3,5,6};
        int ar4[] = ar1;
        int ar3[] = {1,2,3,5,6};
        ArrayList<ArrayList<Integer>> ar2 = new ArrayList<>();
//        ar2[1]=ar1;
//        ar2[0]=new ArrayList<>(5);
        ar2.add(new ArrayList<>(5));
        ArrayList cars2 = new ArrayList<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        cars2.add("Volvo");
        ArrayList cars3 = cars2;
        ArrayList cars1 = new ArrayList<>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("Mazda");
        System.out.println(cars2.set(0, "WWWW"));
        System.out.println(cars2.contains("Volvo"));
//        System.out.println(cars + "5");
//        System.out.println(ar1);
//        System.out.println(Arrays.toString(ar1));
//        System.out.println(ar1.equals(ar3));
//        System.out.println(ar1 == ar3);
//        System.out.println(ar1.equals(ar4));
//        System.out.println(ar1 == ar4);
//        System.out.println(cars1.equals(cars2));
//        System.out.println(cars1 == cars2);
//        System.out.println(cars2.equals(cars3));
//        System.out.println(cars2 == cars3);


    }
}

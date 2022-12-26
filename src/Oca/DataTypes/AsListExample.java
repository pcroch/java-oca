package Oca.DataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListExample {


    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        List testList = Arrays.asList(test);
        ArrayList testArrayLIst = new ArrayList<>(testList);
        System.out.println(Arrays.toString(test));
        System.out.println(testList);
        System.out.println(testArrayLIst.add(6));

        ArrayList testArrayLIst1 = new ArrayList<Integer>();



        Integer[] test10 = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(test10);
        System.out.println(Arrays.toString(test10));
        System.out.println("test10"+ Arrays.toString(list.toArray()));

        int[] test101 = new int[]{1, 2, 3, 4, 5};
        List list1 = Arrays.asList(test10);
        // need a loop to convert it element by element from int ot Integer
        System.out.println(Arrays.toString(test10));
        System.out.println("List to test10"+ Arrays.toString(list.toArray()));
    }
}

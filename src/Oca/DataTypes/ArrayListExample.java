package Oca.DataTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    ArrayList list1 = new ArrayList();
    ArrayList list2 = new ArrayList(10);
    ArrayList list3 = new ArrayList(list2);
    ArrayList list4 = new ArrayList(11);
;

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); // [5, 81, 99]
        ArrayListExample myArrayList = new ArrayListExample();
        myArrayList.list2.add(1);
        myArrayList.list3.add(2);
        System.out.println(myArrayList.list2);
        System.out.println(myArrayList.list3.toString());
    }
}

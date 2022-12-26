package Oca.MockExamen;

import java.util.*;

public class Question41 {
    public static void main(String[] args) {
        String[] array = {"Natural History", "Science", "Art"};
        ArrayList cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        List<String> Question41 = Arrays.asList(array);
        List<String> Question41bis = cars;
//        Question41.remove(2);
        Question41bis.remove(2);
        System.out.println(Question41);
        System.out.println(Question41bis);
    }
}

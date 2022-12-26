package Oca.Examen4;

import java.util.ArrayList;
import java.util.List;

public class Question32 {
    public static void main(String[] args) {
        Integer ii = 10;
        List<Integer> list = new ArrayList<>();
        list.add(ii);
        list.add(new Integer(ii));
        list.add(ii);

        list.removeIf(i -> i == 10);

        System.out.println(list);
    }
}

package Oca.Examen2;

import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);
    }
}

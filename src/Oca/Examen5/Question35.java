package Oca.Examen5;

import java.util.ArrayList;
        import java.util.List;

public class Question35 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");

        List<String> subList = list; //Line n1
        subList.set(0, "E"); //Line n2
        System.out.println(list);
    }
}

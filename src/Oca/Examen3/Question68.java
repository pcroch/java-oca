package Oca.Examen3;

import java.util.*;

public class Question68 {
    public static void main(String[] args) {
        List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Date"));


        System.out.println(dryFruits.get(0) == dryFruits.get(2)); // false
        System.out.println(dryFruits.get(0).equals(dryFruits.get(2))); // false
        System.out.println(dryFruits.get(0).toString().equals(dryFruits.get(2).toString())); // true
        for (int i = 0; i < dryFruits.size(); i++) {
            if (i == 0) {
                dryFruits.remove(new StringBuilder("Almond"));
            }
        }

        System.out.println(dryFruits);

    }
}

package Oca.Examen3;

import java.time.LocalDate;

public class Question20 {


    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2000-06-25");
//        while(date.getDayOfMonth() >= 20) {
//            System.out.println(date);
//            date.plusDays(-1);
//        }

        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getDay()); // it doesn t exist
    }
}

package Oca.Examen3;

import java.time.LocalDate;

public class Question54 {
    public static void main(String [] args) {
        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));
    }
}

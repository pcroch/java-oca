package Oca.JavaBasics;



import Oca.HandlingExceptions.Baseball;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateAndTime {


    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate date = LocalDate.parse("2015 02 01", f);
        System.out.println(date);

        DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter ff2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); // if Full throws exceptions
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("2009-12-31 03:59:59", f1);
        LocalDateTime dateTime1 = LocalDateTime.now();

        LocalDate d = LocalDate.of(2015, 3, 1);
        System.out.println(d);

        String date1 = ff.format(dateTime);
        System.out.println(date1);

        System.out.println(ff2.format(dateTime1));
    }
}

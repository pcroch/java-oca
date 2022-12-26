package Oca.DataTypes;

import org.w3c.dom.ls.LSOutput;

public class Question6 {
    String a = "aaaaa";


    public String toString() {
        return "Name: '" + a;
    }
    public String convert(Integer value) {
        return value.toString();
    }
    public String convert(Object value) {
        return value.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Question6().convert(5));
        System.out.println(new Question6().convert(new Question6()));
    }
}

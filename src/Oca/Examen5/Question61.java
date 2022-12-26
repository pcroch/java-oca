package Oca.Examen5;

public class Question61 {
    public static void main(String[] args) {
//        String [] arr = new String[7];
        StringBuilder sb = new StringBuilder("10");
        StringBuilder sb1 = new StringBuilder("10");
        System.out.println(sb);
        System.out.println(sb == (sb1));
        System.out.println(sb.toString().equals(sb1.toString()));
        System.out.println(sb.equals(sb1));
    }
}

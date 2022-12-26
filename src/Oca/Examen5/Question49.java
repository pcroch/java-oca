package Oca.Examen5;

public class Question49 {
    public static void main(String [] args) {
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));
        System.out.println(flag);
    }
}

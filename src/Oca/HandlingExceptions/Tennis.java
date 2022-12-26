package Oca.HandlingExceptions;

public class Tennis {

    static void playTennis()  {
        System.out.println('A');
        Object ref = null;
        ref.toString();

    }
    public static void main(String[] officials)  {
        System.out.println('B');
        playTennis();
        System.out.println('C');
    }

}
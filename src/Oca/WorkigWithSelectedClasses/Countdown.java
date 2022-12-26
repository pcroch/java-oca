package Oca.WorkigWithSelectedClasses;


public class Countdown {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("0123456");
        String hello ;
        System.out.println(builder.substring(2));
        System.out.println(builder.charAt(1));
        System.out.println(builder.substring(4));
        hello = builder.substring(4,5);
        System.out.println(hello);
        System.out.println(builder);
        System.out.println(builder.deleteCharAt(5));
        System.out.println(builder);
    }
}

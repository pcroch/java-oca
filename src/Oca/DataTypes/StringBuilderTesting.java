package Oca.DataTypes;

public class StringBuilderTesting {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aSDGRYDRTHa").insert(1, "qw");
        StringBuilder sb1 = new StringBuilder(500);
        sb.delete(1, 186660);
        System.out.println(sb.length());
        System.out.println(sb1.length());
        System.out.println(sb);
    }
}

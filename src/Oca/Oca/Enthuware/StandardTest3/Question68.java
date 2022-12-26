package Oca.Oca.Enthuware.StandardTest3;

public class Question68 {
    public static void main(String[] args) {
        String s1 = new String("java");
        StringBuilder s2 = new StringBuilder("java");
        replaceString(s1);
        replaceStringBuilder(s2);
        System.out.println(s1 + s2);
        int s3 = 1;
        replaceInteger(s3);
        System.out.println(s3);
    }

    static void replaceString(String s) {

        s = s.replace('j', 'l');
        // s.replace('j', 'l');create  new String LAVA and assign it tothe argument so the arg point to another string now
        // if the aeg was a StringBuilder then the story would have beendifferent bcse a String builder is mutable
    }

    static void replaceInteger(int s) {

        s = s + 4;
    }


    static void replaceStringBuilder(StringBuilder s) {
        s.append("c");
    }
}

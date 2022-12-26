package Oca.DataTypes;

public class StringConcat {
    public static void main(String[] args) {
        String ab = "ab";
        String a = "a";
        String b = "b";
        String c = a + b;
        String d = a.concat(b);
        String ab1 = "ab";
        int i ='1';
        System.out.println("----");
        System.out.println(ab == c);
        System.out.println(ab.equals(c));
        System.out.println("----");
        System.out.println(ab == d);
        System.out.println(ab.equals(d));
        System.out.println("----");
        System.out.println(ab == (a + b));
        System.out.println("----");
        System.out.println(ab.indexOf('e', 'z'));
        System.out.println("----");
//        System.out.println(ab.substring('e', 'z')); // java.lang.StringIndexOutOfBoundsException: begin 101, end 122, length 2
        // System.out.println(ab.substring('1')); // java.lang.StringIndexOutOfBoundsException: String index out of range: -47
        System.out.println(i);


    }
}

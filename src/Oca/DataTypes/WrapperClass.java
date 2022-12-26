package Oca.DataTypes;

public class WrapperClass {
    static char c = 'S';
    static String s = String.valueOf(c);


    public static void main(String... arg) {
//        System.out.println(c);
//        System.out.println(s);
        Double D1 = new Double(17.8d);
//        Double D2 = new Double(17.8);
//        double D3 = new Double(17.8d);
//        System.out.println(D1);
//        System.out.println(D2);
//        System.out.println(D3);

        System.out.println(Boolean.valueOf(true));
        System.out.println(D1.doubleValue());
        System.out.println(Integer.valueOf((int) 1.5));
        System.out.println(Integer.valueOf((int) 1.4));
        System.out.println(Integer.valueOf((int) 1.6));
        System.out.println(Integer.valueOf((int) 1.9));
        System.out.println((double)((int) 1.6));

    }
}

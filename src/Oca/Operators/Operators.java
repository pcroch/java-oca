package Oca.Operators;

public class Operators {


    public static void main(String... arg) {
//        short s1 = 1921222;
//        short s1 = 32767; // max value or 2^16
//        s1 += 1; // -32768
//        Short s2 = Short.MAX_VALUE;
//        System.out.println(s1);

        short t = 9, g = 2;
//        t *=g;
        t = (short) (t * g);
        System.out.println(t);
        Short z = (short) 5;// new is useless
        Integer z2 = 5;
        float f1 = 5f;
        float f2 = 5;
        double d1 = 5;
        int x;
        int y = (x = 3);
        String r = "bbb";
        String l = "56";
        Double d4 = 10.00;
        double d5 = 10.00;
//        Integer aq = new Integer(5.0); -- not valid
        int aaa = '5';
        long bbb = '5';
        char ccc ='v';
        int ddd =ccc;
        String a = Integer.toString(t);
        String d4s = d4.toString();

//        System.out.println(a instanceof String );
        System.out.println(z2.floatValue());
//        System.out.println(Integer.parseInt(r));
        System.out.println(Integer.decode(l).getClass());
        System.out.println(Float.toString(f1)); // car Sout fait tostring par default
        System.out.println(d4==d5);
        System.out.println(d4.equals(d5));
    }


}

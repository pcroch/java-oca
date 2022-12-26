package Oca.DataTypes;

public class StringExample {


    void exampleStr() {
        String str = "Welcome to geeksforgeeks";
//        System.out.println(str.intern());
        System.out.println(str.concat(str));
    }

    boolean exampleStr1() {
        String str1 = "Welcome to geeksforgeeks string 1";

//        return str1.startsWith("string", 25);
        return str1.startsWith("to");
    }

    ;


    public static void main(String... arg) {
        StringExample myExample = new StringExample();
//        myExample.exampleStr();
        System.out.println(myExample.exampleStr1());

    }


}

package Oca.DataTypes;

public class StringBuilderExample {
    StringBuilder sb2 = new StringBuilder("alphabet two ");

    StringBuilder exampleSb() {
        StringBuilder sb = new StringBuilder("alphabet ");
        sb.append("Java");
        return sb;
    }

    void exampleSb1() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Helo");
        System.out.println(sb1);
    }

    void exampleSb3() {
        StringBuilder sb3 = new StringBuilder(20);
        sb3.append("HelloInsert");
        System.out.println(sb3.insert(3, new char[]{'1', '2','3',4},0,4));
        System.out.println(sb3);
    }

    void exampleSb4() {
        StringBuilder sb4 = new StringBuilder("helloIndexOf");
        System.out.println(sb4.indexOf("Index",80));
        System.out.println(sb4);
    }



    public static void main(String... arg) {
    StringBuilderExample myExample = new StringBuilderExample();
//        System.out.println(myExample.exampleSb());
//        myExample.exampleSb1();
        myExample.exampleSb4();




    }


}

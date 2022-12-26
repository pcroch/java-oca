package Oca.DataTypes;

public class StaticVariableExample {


    private boolean numLock = true;
    static boolean capLock = false;

    public static void main(String... shortcuts) {
//        System.out.print(numLock+" "+capLock); Doesn't not compile bcse of nulLock


        System.out.print(new StaticVariableExample().numLock + " " + StaticVariableExample.capLock);
    }
}


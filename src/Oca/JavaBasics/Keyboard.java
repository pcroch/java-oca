package Oca.JavaBasics;

public class Keyboard {
    private boolean numLock = true;
    static boolean capLock = false;

   public void aaa(){
       numLock = false;
   }
    public static void main(String... shortcuts) {
        System.out.print(capLock+" "+capLock);
    }

}

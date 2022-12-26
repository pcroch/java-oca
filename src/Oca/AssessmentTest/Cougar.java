package Oca.AssessmentTest;

interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
 public int getTailLength() {return 4;}
 }
public class Cougar extends Puma {
    public static void main(String[] args) {
        Cougar puma = new Cougar();
         System.out.println(puma.getTailLength());
         }

         public int getTailLength(int length) {return 2;}
 }

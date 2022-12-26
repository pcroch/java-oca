package Oca.MockExamen;

import java.io.IOException;

public class Question50 {
    public static void swing(int... beats) throws IOException {
//        try {
//            System.out.print("1"+beats[2]);  // p1
        throw new IOException();
//        } catch (RuntimeException e) {
//            System.out.print("2");
//        } catch (Exception e) {
//            System.out.print("3");
//        } finally {
//            System.out.print("4");
//        }
    }
    public static void main(String... music)   {

                try {
        new Question50().swing(0,0);  // p2
        } catch (RuntimeException e) {
            System.out.print("2");
        } catch (Exception e) {
            System.out.print("3");
        } finally {
            System.out.print("4");
        }
        System.out.print("5");
    }
}

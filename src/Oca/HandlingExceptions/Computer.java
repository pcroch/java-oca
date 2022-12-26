package Oca.HandlingExceptions;


import java.io.IOException;

public class Computer {
    public void compute() throws Exception{
        throw new Exception("Error processing request");
    }
    public void calculator () {
        throw new ArrayIndexOutOfBoundsException("Error processing calculator");
    }
    public static void main(String[] bits) throws Throwable {
//        try {
//            new Computer().compute();
//
//            System.out.print("Ping");
//        } catch (NullPointerException e) {
//            System.out.print("Pong");
//            throw e;
////        } catch (RuntimeException ef) {
////            System.out.print("Pongf");
////            throw ef;
//        } catch (Exception ee){
//            System.out.println("exeption");
//            try {
//                throw ee;
//            } catch (Exception e) {
//                System.out.println("hello from the end");
//                e.printStackTrace();
//            }
//        }
        /* More example to understand */
        new Computer().compute();
    }
}

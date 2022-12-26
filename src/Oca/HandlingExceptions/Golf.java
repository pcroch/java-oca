package Oca.HandlingExceptions;

import java.io.IOException;

class Golf{
        void method()throws IOException{
//            throw new IOException("device error");
            System.out.println("device operation performed");
        }
    }
    class Testthrows4{
        public static void main(String args[])throws IOException{//declare exception
            Golf m=new Golf();
            m.method();

            System.out.println("normal flow...");
        }
    }

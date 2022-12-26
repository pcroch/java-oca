package Oca.HandlingExceptions;

public class Computer1 {
    public void compute()  {
        throw new RuntimeException("Error processing request");
    }
    public static void main(String[] bits)    {
        try {
            new Computer1().compute();
            System.out.print("Ping");
        } catch (Exception e) {
            System.out.print("Pong");

        }
    }
}

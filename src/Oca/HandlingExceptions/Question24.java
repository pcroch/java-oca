package Oca.HandlingExceptions;

public class Question24 {
    public void compute() throws Exception {
        throw new RuntimeException("Error processing request");
    }
    public static void main(String[] bits) throws Exception  {
        try {
            new Question24().compute();
            System.out.print("Ping");
        } catch (NullPointerException e) {
            System.out.print("Pong");
            throw e;
        }
    }
}

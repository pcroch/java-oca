package Oca.HandlingExceptions;

public class Baseball {
    public static int score = 1;
    public static void main(String... teams) {

        try {

            System.out.print(score++);
        } catch (Throwable t) {score = 9;
            System.out.print(score++);
        } finally {
            System.out.print(score++);
        }
        System.out.print(score++);
    }
}

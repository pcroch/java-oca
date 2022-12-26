package Oca.Examen2;

public class Question18 {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        try {
            m1();


        } finally {
            System.out.println("A");
        }
    }
}

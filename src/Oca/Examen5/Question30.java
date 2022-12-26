package Oca.Examen5;

public class Question30 {
    private static void m()  {
        try {
            throw new SQLException();
        } catch (Exception e) {
//            throw e;
        }
    }

    public static void main(String[] args) {
        m();
    }
}

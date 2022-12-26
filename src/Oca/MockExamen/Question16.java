package Oca.MockExamen;

public class Question16 {

    public static void main(String[] args) {
        String shoe1 = new String("sandal");
        String shoe2 = new String("flip flop");
        String shoe3 = new String("croc");

        shoe1 = shoe2;
        shoe2 = shoe3;
       shoe3 = shoe1;
    }
}

package Oca.Examen1;

public class Question29 {

    public static void main(String[] args) {
        double price = 90000;
        String model;
        if(price > 100000) {
            model = "Tesla Model X";
        } else  {
            model = "Tesla Model S";
        }
        System.out.println(model);
    }
}

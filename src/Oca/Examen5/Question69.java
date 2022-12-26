package Oca.Examen5;

public class Question69 {
    public static void main(String[] args) {
        String word = "REBUS";
        StringBuilder w = new StringBuilder("Word");
//        w.delete(2, 1);
        word = word.substring(2, 5);
        System.out.println(word);
        System.out.println(w);
    }
}

package Oca.DataTypes;

public class Question50 {
   public Question50() {
        System.out.print("a");
    }
    public void Question50() {
        System.out.print("b");
    }
    public void run() {
        new Question50();
        Question50();

    }
    public static void main(String... args) {
        new Question50().run();
    }
}

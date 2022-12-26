package Basics;


public class Sports {
    String color = "red";

    public Sports() {}

    public Sports(String color) {
        color = "purple";
        System.out.print(color);
    }

    private void printColor(String color) {
        color = "purple";
        System.out.print(color);
    }



    public static void main(String[] rider) {
        new Sports().printColor("blue");
        System.out.println(" ");
        new Sports("orange");
        System.out.println(" ");
        Sports redColor = new Sports();
        System.out.println(redColor.color);

    }
}

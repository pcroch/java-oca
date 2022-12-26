package Oca.WorkingInheritance;

public class Song {
    public void playMusic() {
        System.out.print("Play!");
    }
    private static int playMusic1() {
        System.out.print("Music!");
        return 1;
    }
    public static void main(String[] tracks) {
        new Song().playMusic1();
    }
}

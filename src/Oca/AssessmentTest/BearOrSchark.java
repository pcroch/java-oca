package Oca.AssessmentTest;

public class BearOrSchark {

    public static void main(String[] args) {
        int luck = 10;
        if ((luck > 10 ? luck++ : --luck) < 10) {
            System.out.print("Bear");
            System.out.println(luck);
        }


        if (luck < 10) System.out.print("Shark");
    }
}

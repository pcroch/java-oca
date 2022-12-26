package Oca.WorkingInheritance;

import Oca.HandlingExceptions.Baseball;
import Oca.JavaBasics.Airplane;

import java.util.ArrayList;

public class AccesModifierPractice extends Airplane {
    static final ArrayList<String> aa = new ArrayList<>();
    final int uuaa;

    static Baseball baseball = new Baseball();

    public AccesModifierPractice(int x) {
        super(x);

    }

    {
        this.uuaa = 1;
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane(5);
//        int start = airplane.start;
//        System.out.println(start);
        System.out.println(baseball.score);
        System.out.println(aa);
    }
}

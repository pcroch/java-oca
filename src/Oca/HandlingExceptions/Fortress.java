package Oca.HandlingExceptions;

import java.io.FileNotFoundException;

public class Fortress {
    public void openDrawbridge(){  // p1
        try {
            throw new FileNotFoundException("Circle");
        } catch (FileNotFoundException e) {
            System.out.print("Opening!");
        } finally {
            System.out.print("Walls");  // p2
        }
    }
    public static void main(String[] moat)  {
        new Fortress().openDrawbridge();  // p3
    }
}


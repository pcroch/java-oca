package Oca.MockExamen;


class BubbleException extends Exception {}
class Fish {
    Fish getFish() throws Exception  {
        throw new Exception("fish!");
    }
}
public final class Question17 extends Fish {
    public final Question17 getFish() {
        throw new RuntimeException("clown!");
    }
    public static void main(String[] bubbles) throws Exception {
        final Fish f = new Question17();
        f.getFish();
        System.out.println("swim!");
    }
}


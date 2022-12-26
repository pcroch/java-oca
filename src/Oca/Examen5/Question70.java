package Oca.Examen5;

class Super {
    Super() {
        System.out.print("KEEP_");
    }
}

class Base extends Super {
    Base() {
        super();
        System.out.print("GOING_");
    }
}

public class Question70 {
    public static void main(String[] args) {
        new Base();
    }
}

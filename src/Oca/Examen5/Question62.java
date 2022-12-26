package Oca.Examen5;

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}

abstract class Log {
//    public static void log() {
//        System.out.println("Log");
//    }
}

public class Question62 extends Log implements ILog {
    public static void main(String[] args) {

    }
}

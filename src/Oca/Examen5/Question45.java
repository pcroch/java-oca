package Oca.Examen5;

interface ILogger {
    void log();
}

public class Question45 {
    public static void main(String[] args) {
        ILogger [] loggers = new ILogger[2]; //Line n1
//        ILogger test = new ILogger() {
//            @Override
//            public void log() {
//                System.out.println("heeee");
//            }
//        };
//        test.log();
        for(ILogger logger : loggers)
            System.out.println(logger); //Line n2

    }
}

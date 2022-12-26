package Oca.Examen5;

public class Question72 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(args[1]); //Line n1
            } catch(RuntimeException e) {
                System.out.print("INHALE-"); //Line n2
                throw e; //Line n3
            } finally {
                System.out.print("EXHALE-"); //Line n4
            }
        } catch(RuntimeException e) {
            System.out.print("INHALE-"); //Line n5
        } finally {
            System.out.print("EXHALE"); //Line n6
        }
    }
}

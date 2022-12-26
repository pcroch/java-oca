package Oca.JavaBasics;

 public class Airplane {
    protected  int start = 2;
     public static int startEnd = 52;
    final int end;
    public Airplane(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end-start+" ");
        System.out.print(distance);
    }
    public static void main(String... start) {
        new Airplane(10).fly(5);
    }
}

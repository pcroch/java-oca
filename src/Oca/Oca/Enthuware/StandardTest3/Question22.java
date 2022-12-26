package Oca.Oca.Enthuware.StandardTest3;

public class Question22 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
        if (obj1.equals(obj2)) System.out.println("true");
        else System.out.println("false");
    }
}

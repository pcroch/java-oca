package Oca.Examen5;

class A {
    public String toString() {
        return "fff";
    }
}

public class Question18 {
    public static void main(String [] args) {
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2
    }
}

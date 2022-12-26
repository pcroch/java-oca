package Oca.Examen4;

public class Question$ {
    static StringBuilder sb = new StringBuilder("String");

    public static void adding(StringBuilder s){
        s.append("_aaa");
    }

    public static void main(String[] args) {
        Question$.adding(sb);
        System.out.println(sb);
    }
}

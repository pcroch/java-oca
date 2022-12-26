package Oca.MockExamen;

public class Question32 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(0, 1);
        System.out.println(sb);
    }
}

package Encapsulation;

public class VarArgs {
    public Integer[] arguments(Integer... arg){
        return arg;
//        System.out.println("hello"); will not compile
    }

    public static void main(String... arg){

    }
}

package Oca.Oca.Enthuware.StandardTest2;

class myExecpetion  extends IndexOutOfBoundsException{
    public myExecpetion(String some_exception) {
    };
}

public class Question42 {
    public static void main(String[] args) throws Exception{
        int[] a = null;
        int i = a [ m1() ];
    }
    public static int m1(){
        return 5;
    }
}

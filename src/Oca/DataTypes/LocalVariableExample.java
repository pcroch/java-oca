package Oca.DataTypes;

public class LocalVariableExample {

    public static void test() {
// following example will not compile
//        private int myTest = 50;
//        protected int myTest = 50;
//        public int myTest = 50;
        int myTest = 50;
        System.out.println("Hello " + myTest);
    }


    public static void main(String[] args) {
//        System.out.println(LocalVariableExample.test());
        LocalVariableExample.test();
    }
}

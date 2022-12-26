package Oca.Oca.Enthuware.StandardTest2;


class A {
    A() {
        print();
    }

    void print() {
        System.out.print("A ");
    }
}

class Question56 extends A {
//    byte m = 128;
    final Integer i = 4;

    public static void main(String[] args) {
        A a = new Question56();
        a.print();
    }

    void print() {
        System.out.print(i + " ");
    }
}

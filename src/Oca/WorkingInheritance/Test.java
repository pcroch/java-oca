package Oca.WorkingInheritance;


class A {
    public void print() {
        System.out.println("A");
    }
}


class B extends A {
    public void print() {
        System.out.println("B");
    }
}


public class Test {
    public static void main(String[] args) {
        A obj1 = new B();
        B obj2 = (B)obj1;
        obj2.print();
    }
}

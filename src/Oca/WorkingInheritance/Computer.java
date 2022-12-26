package Oca.WorkingInheritance;

class Computer {
    protected Computer process() { return this; }
}
class Laptop extends Computer {

    public final Laptop process() {
//        System.out.println("hello Laptop");
        return this;
    }
    public static void main(String[] chips) {
        System.out.println(new Laptop().process());
        System.out.println(new Computer().process());
    }
}

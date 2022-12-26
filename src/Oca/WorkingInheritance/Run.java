package Oca.WorkingInheritance;

interface Run {
    default void walk() {
        System.out.print("Walking and running!");
    }
}
interface Jog {
    default void walk() {
        System.out.print("Walking and jogging!");
    }
}
class Sprint implements Run, Jog {
    public void walk() {
        System.out.print("Sprinting!");
    }
    public static void main() {
        new Sprint().walk();
    }
}

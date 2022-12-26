package Oca.WorkingInheritance;

public class Mamal {
    private final int numberOflEgs = 4;

    public int getNumberOflEgs() {
        return this.numberOflEgs;
    }
}

class Monkey extends Mamal {
    private final int numberOflEgs = 2;

//    public int getNumberOflEgs() {
//        return this.numberOflEgs;
//    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        System.out.println(monkey.getNumberOflEgs());
        System.out.println(monkey.numberOflEgs);
    }

}

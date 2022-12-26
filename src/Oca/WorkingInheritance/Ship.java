package Oca.WorkingInheritance;

public class Ship {
    protected int weight = 3;
    private int height = 5;
    public int getWeight() { return weight; }
    public int getHeight() { return height; }
}

 class Rocket extends Ship {
    public int weight = 2;
    public int height = 4;
    public void printDetails() {
        System.out.print(super.getWeight()+","+super.getHeight());
    }
    public static final void main(String[] fuel) {
        new Rocket().printDetails();
    }
}

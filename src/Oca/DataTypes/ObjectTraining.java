package Oca.DataTypes;

public class ObjectTraining {

//    @Override
//    public String toString() {
//        return "aaa";
//    }

    public static void main(String[] args) {
        ObjectTraining a = new ObjectTraining();
        ObjectTraining b = new ObjectTraining();
        ObjectTraining c = b;
        System.out.println("--------");
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------");
        System.out.println(a ==b);
        System.out.println(a.equals(b));
        System.out.println("--------");
        System.out.println(b ==c);
        System.out.println(b.equals(c));
    }
}

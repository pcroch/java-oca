package Oca.DataTypes;

public class Toy {
    public void play() {
        System.out.print("play-");
    }
    protected void finalize() { // name change and run ero or one time and not more!!!!
        System.out.print("clean-");
    }
    public static void main(String[] fun) {

        Toy car = new Toy();
        car.play();
        car=null; // give a reason to use the garbage collector
        System.gc(); // it is not garanted to run
        Toy doll = new Toy();
        doll.play();
        doll = null;

    }
}

//
//public class Toy {
//    public void play() {
//        System.out.print("play-");
//    }
//
//    public void finalize() {
//        System.out.print("clean-");
//    }
//
//    public static void main(String[] args) {
//        Toy car = new Toy();
//        car.play();
//        System.gc();
//        Toy doll = new Toy();
//        doll.play();
//        doll = null;
//    }
//}

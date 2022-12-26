package Oca.Oca.Enthuware.StandardTest2;

//in file Movable.java

 interface Movable {
    int location = 0;
    void move(int by);
    public void moveBack(int by);
}


//in file Donkey.java


 class Donkey implements Movable{
    int location = 200;
    public void move(int by) {
        location = location+by;
    }
    public void moveBack(int by) {
        location = location-by;
    }
}


//in file TestClass.java

 class Question6 {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);
    }
}

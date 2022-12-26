package Oca.WorkingInheritance;

 class Rotorcraft {
     protected  final  int height = 5;
    int fly(){return this.height;}
}
class Helicopter extends Rotorcraft {
    private final int height = 10;
    int fly() {
        return this.height;
    }

    public static void main(String[] unused) {

//        Rotorcraft h = (Helicopter) new Rotorcraft();
        Rotorcraft h = (Rotorcraft) new Helicopter();
//        Helicopter h =  new Helicopter();
        System.out.print(h.fly());
    }
}
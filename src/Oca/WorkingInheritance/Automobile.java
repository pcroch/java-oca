package Oca.WorkingInheritance;

class Automobile {
    String drive() { return "Driving vehicle"; }
}
class Car extends Automobile {
    protected String drive() { return "Driving car"; }
    protected String drive(String sss) { return sss; }
}
class ElectricCar extends Car {
    public String drive() { return "Driving electric car"; }
    public static void main(String... wheels) {
        final Car car = new Car();
        System.out.print(car.drive());
        System.out.print(car.drive("asd"));
    }
}

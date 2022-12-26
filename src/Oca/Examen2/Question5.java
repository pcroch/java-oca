package Oca.Examen2;

class Vehicle {
    int getRegistrationNumber() {
        return 1;
    }
}

class Car {
    public int getRegistrationNumber() {
        return 2;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Car obj = new Car();
        int obj1 = new Vehicle().getRegistrationNumber();
        System.out.println(obj.getRegistrationNumber());
    }
}

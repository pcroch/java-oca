package Oca.Examen5;


class Animal {
    Animal() {
        System.out.print("ANIMAL-");
    }
}


//Dog.java


class Dog extends Animal {
    public Dog() {
        System.out.print("DOG");
    }
}


//Test.java
public class Question43 {
    public static void main(String[] args) {
        new Dog();
    }
}


package Oca.Examen1;


abstract class Animal {
    private String name;

    Animal() {
        this.name = "name";
    }
    Animal(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String name, String breed) {

//              super(name); // instead of a no-argument construtor
        this(breed);
//        this.breed = breed;
    }

    Dog(String breed) {
//        super(breed); // instead of a no-argument construtor
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }
}

public class Question31 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
                dog2.getName() + ":" + dog2.getBreed());
    }
}

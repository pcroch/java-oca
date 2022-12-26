package Basics;
// Source: https://www.baeldung.com/java-type-casting
class Animal {
   public String name;
    public void eat() {
        System.out.println("Grrrr");
    }
}

public class Cat extends Animal {
//    In the example above, the eat() method is overridden. This means that although eat() is called on the variable of the Animal type, the work is done by methods invoked on real object — cats:
int age;
    @Override
    public void eat() {
        System.out.println("Eat");
    }

    public void meow() {
        System.out.println("Meow");
       return;
    }


    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Animal animal1 = new Animal();
//        Animal animal = cat; // upcasting
//        animal.eat();
//        animal1.eat();
//        Cat cat1 = (Cat) animal1; //down casting but cast exception
        Animal anim = new Cat();
        Cat cat = new Cat();
//        cat.name = "sss";
        anim.name="Pony";
        Cat cat1 = (Cat) anim;
        cat1.eat();

    }
}

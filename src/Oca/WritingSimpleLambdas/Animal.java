package Oca.WritingSimpleLambdas;

import java.util.function.Predicate;

//interface CheckTrait { // === Predicate
//    boolean test(Animal a);
//}
//
//class CheckIfHopper implements CheckTrait { === lamba expression
//    public boolean test(Animal a) {
//        return a.canHop();
//    }

//    public static boolean test1(Animal a) {
//        return a.canSwim();
//    }
//}

public class Animal {


    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        this.species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    boolean canHop() {
        return canHop;
    }

    boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }

}

class TraditionalSearch {
    public static void main(String[] args) {
        Animal horse = new Animal("Lucky", true, true);
        Animal cow = new Animal("Meat", true, true);
        System.out.println(horse.canHop());
//        System.out.println("Hop" +Animal.test1(horse));
//        System.out.println("Swim" +horse.test(horse));
        System.out.println("--- New Line ----");
//        print(horse, new CheckIfHopper());
        print(horse, a -> a.canSwim());

        System.out.println("--- New Line 1----");
        print(horse, (Animal ab) -> {
            return ab.canSwim();
        });
        System.out.println("--- New Line 2----");
        print(cow, (Animal b) -> {
            return b.equals(horse);
        });
        System.out.println("--- New Line 3----");
    }


    private static void print(Animal a, Predicate<Animal> checker) {
        if (!checker.test(a))
            System.out.println(a + " ");
    }
}
//    public static void main(String[] args) {
//        List<Animal> animals = new ArrayList<Animal>(); // list of animals
//        animals.add(new Animal("fish", false, true));
//        animals.add(new Animal("kangaroo", true, false));
//        animals.add(new Animal("rabbit", true, false));
//        animals.add(new Animal("turtle", false, true));
//
//        printMyAnimal(animals, new CheckIfHopper()); // pass class that does check
//    }
//
//    private static void printMyAnimal(List<Animal> animals, CheckTrait checker) {
//        for (Animal animal : animals) {
//            if (checker.test(animal)) // the general check
//                System.out.print(animal + " ");
//        }
//        System.out.println();
//    }



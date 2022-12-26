//package Basics;
//
//import Oca.WritingSimpleLambdas.Animal;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//// thanks to inheritance
//public class PredicateSearchTest {
//    public static void main(String[] args) {
//        List<Animal> animals = new ArrayList<Animal>();
//        animals.add(new Animal("fish", false, true));
//        animals.add(new Animal("kangaroo", true, false));
//
//        print(animals, a -> a.canHop()); // default acces dos nt allow acces to the method
//    }
//
//    private static void print(List<Animal> animals, Predicate<Animal>
//            checker) {
//        for (Animal animal : animals) {
//            if (checker.test(animal))
//                System.out.print(animal + " ");
//        }
//        System.out.println();
//    }
//}
package GeekForGeeks.Abstraction;

// Abstract class
abstract class Animal {
    protected String aaaBBB="Hello";
    public Animal(){}; // empty constructor

    // Abstract method (does not have a body)
    abstract void animalSound();

    // Abstract method (does not have a body)
    protected abstract void run();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }


    public static void main(String[] args) {
        Animal myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        Pig myPigBabe = new Pig(); // Create a second Pig object
        myPigBabe.animalSound();
        myPigBabe.sleep(5);
        Animal myHorse = new Horse(); // Create a Pig object
        myHorse.animalSound();
        myHorse.sleep();
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal{
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee " + aaaBBB);
    }
    public void run(){ // overriding from abstract class
        System.out.println("Run run ");
    }

    public void sleep(int time) { // overloading
    System.out.println("Ro-Ro " + time + " hours");
    }
}

    class Horse extends Animal{
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The horse says: hu hu " + aaaBBB);
        }
        public void run(){
            System.out.println("galope ");
        };
}

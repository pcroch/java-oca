package Oca.WorkingInheritance;

interface Earth {
    public static int legsEarth = 2;
    public int ageEarth = 21;

    default int gravity() {
//        System.out.println(this.ageEarth + legsEarth);
        return ageEarth + legsEarth;
    }

    public abstract void continent();

    public int countryCode();
}


abstract class God {
    public static int myInt = 4;
    private int myIntGod;
    public String myIntQueen = "Mu qeen";

    void setGod(int myIntGod) {
        this.myIntGod = myIntGod;
    }

    int getGod() {
        return myIntGod;
    }

    public static void jesusChrist() {
        {
            System.out.println("god is called");
        }
    }

    public static boolean maryMother() {

        return myInt > 5;

    }
}

public class Human extends God implements Earth {
    public static int legs = 2;
    public int age = 21;
    public int arms = 7;
    protected int _$_1_ = 9;


    public void setHuman(int myIntGod) {
        super.setGod(myIntGod);
    }

    ;

    public int getHuman() {
        return super.getGod();
    }

    ;

    public void getAge() {
        System.out.println("getAge() method in Human" + ' ' + age);
    }

    public void getArms() {
        this.arms += this.arms;
        System.out.println("return arms" + this.arms);
    }

    public static void getArms(int x) {
//        this.arms+= this.arms;
        System.out.println("return arms" + ' ' + x);
    }

    public static boolean numberOFLegs() {
        return legs > 5;
    }

    public void continent() {
        System.out.println("Empty");
    }

    public int countryCode(){
        return 6;
    }


}

class Teacher extends Human {
    int intArray[];
    private class School implements Earth {
        public void continent() {
            System.out.println("hello for continent");
        }

        public int countryCode() {
            return 5;
        }
    }

    public void getAge() {
        System.out.println("getAge() method in Teacher")
        ;
    }

    public void getLegs() {
        System.out.println("return legs" + "" + Human.numberOFLegs());
    }

}

class Characteristics {
    public static void showAgeOfObject(Human param) {
        param.getAge();
    }

    public static void showLegOfObject(Teacher param) {
        param.getLegs();
    }

    public static void showArmsOfObject(Human param) {
        param.getArms();
    }


    public static void main(String[] args) {
        Human human = new Human();
        Teacher teacher = new Teacher();
        Human test = (Human) teacher; // Casting teacher to a Human type
        // Results
        Characteristics.showAgeOfObject(human); // getAge() method in Human
        showAgeOfObject(teacher); // getAge() method in Teacher
        showAgeOfObject(test); // getAge() method in Teacher
        showLegOfObject(teacher); // return legs
        //  showLegOfObject((Teacher) human); // it will not compile: ClassCastException
        showArmsOfObject(teacher); // return arms
        showArmsOfObject(human);// return arms
        Human.getArms(5);
        God.jesusChrist();
        God.maryMother();
        System.out.println(Human.numberOFLegs());
        System.out.println(God.myInt);
        System.out.println(human.gravity());
        human.setHuman(99);
        System.out.println(human.myIntQueen);
//        System.out.println(God.myIntQueen);
        System.out.println(human.getHuman());
        System.out.println(teacher.intArray);
    }
}

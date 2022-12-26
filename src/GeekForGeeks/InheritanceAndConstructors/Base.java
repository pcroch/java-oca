package GeekForGeeks.InheritanceAndConstructors;

class Base {
    Base(String str) {
        System.out.println("Base Class Constructor Called " + str);
    }

    Base(String str, Integer baseInt) {
        System.out.println("Base Class Constructor Called " + str + baseInt);
    }

    Base(String str, Integer baseInt, Integer baseInt1) {
        System.out.println("Base Class Constructor Called " + str + baseInt + baseInt1);
    }
}

class Derived extends Base {
    private final static Integer baseInt;
    private static Integer derivedInt =99;
    static {
        baseInt = 1;
    }
    Derived(String str) {
        this(str, derivedInt); // no compile if derivedInt is an instance variable
    }

    Derived(String str, Integer derivedIntConstructor) {
        super(str, derivedIntConstructor);
        System.out.println("Derived Class Constructor with 2 arguments Called " + str + derivedIntConstructor);
    }


    public static void main(String[] args) {
        Derived d = new Derived("hello", 5);
        Derived d1 = new Derived("hello");
    }
}

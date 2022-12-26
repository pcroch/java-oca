package Oca.WorkingInheritance;

abstract class Ball implements Equipment, Stadium {
    protected int size;
    int length;
    protected int Switch;

    public Ball(int size) {
        this.size = size;
    }

    public void Goal(int i) { // ust be public bcse Goial abtract is by definition public

    }

    public abstract String Grass();
}

interface Equipment extends Training {

    void Ball();
}

interface Training {
}

interface Stadium {

    public void Goal(int i);

    public default String Grass() {
        return "Green";
    }
}


class SoccerBall extends Ball {
    public SoccerBall() {
        super(5);
    }

    public void setSoccerBall(int size) {
        this.size = size;
    }

    public Ball get() {
        return this;
    }

    public static void main(String[] passes) {
        Equipment equipment = (Equipment) (Ball) new SoccerBall().get();
        System.out.print(((SoccerBall) equipment).size);
        Equipment equipment1 = (Equipment) new SoccerBall().get();
        ((SoccerBall) equipment1).setSoccerBall(10);
        System.out.print(((SoccerBall) equipment1).size);
    }

    @Override
    public void Goal(int i) {
        System.out.println("Goal");
    }

    @Override
    public String Grass() {
        return "Brawn";
    }

    @Override
    public void Ball() {
        System.out.println("bcse it is implemented by Ball Abstract class");
    }
}

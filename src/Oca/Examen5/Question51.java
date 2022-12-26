package Oca.Examen5;

interface Profitable1 {
    default double profit() {
        return 12.5;
    }
}


//Profitable2.java


interface Profitable2 {
    default  double profit() {
        return 25.5;
    }
}


//Profit.java


public abstract class Question51 implements Profitable1, Profitable2 {
    @Override
    public double profit() {
        return Profitable2.super.profit();
    }
    /*INSERT*/
}

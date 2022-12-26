package Oca.Examen5;

import java.util.List;

class Father {}

class Son extends Father {}

class GrandSon extends Son {}

abstract class Question {
    abstract List<Father> get();

    abstract int get1();
}


class Question26 extends Question {
    @Override
    List<Father> get() {
        return null;
    }

    @Override
    int get1() {
        return 0;
    }
    /*INSERT*/
}

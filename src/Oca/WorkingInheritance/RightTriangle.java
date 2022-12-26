package Oca.WorkingInheritance;

abstract class Triangle {
    abstract String getDescription();
}
public class RightTriangle extends Triangle {
    protected String getDescription() { return "rt"; } // g1
}
class IsoscelesRightTriangle extends RightTriangle { // g2
    public String getDescription() { return "irt"; }
    public static void main(String[] edges) {
        final Triangle shape = new IsoscelesRightTriangle(); // g3
        System.out.print(shape.getDescription());
    }
}

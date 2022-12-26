package Oca.WorkigWithSelectedClasses;

public class Modify {

//    public static void main(String[] args) {
//        StringBuilder line = new StringBuilder("-");
//        StringBuilder anotherLine = line.append("-");
//        System.out.print(line == anotherLine);
//        System.out.print(line.equals(anotherLine));
//        System.out.print(" ");
//        System.out.print(line.length());
//    }
public static void main(String[] args) {
    String line = new String("-");
    line = line.concat("-");
    String line2 = new String("--");
    String line3 = "--";
    String line4 = "--";
    String anotherLine = line;
    System.out.print(line == anotherLine);
    System.out.print(line.equals(anotherLine));
    System.out.println("line2");
    System.out.print(line == line2);
    System.out.print(line.equals(line2));
    System.out.println("line3");
    System.out.print(line == line3);
    System.out.print(line.equals(line3));
    System.out.println("line4");
    System.out.print(line3 == line4);
    System.out.print(line3.equals(line4));
//    System.out.print(" ");
//    System.out.print(line.length());
}
}

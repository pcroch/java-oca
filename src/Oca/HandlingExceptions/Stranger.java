package Oca.HandlingExceptions;

public class Stranger {
    public static String getFullName(String firstName, String lastName) {
        try {
            return firstName.toString() + " " + lastName.toString();

        } catch (NullPointerException e) {
            System.out.print("Problem?");
//            return null; // would make the return after the finally unreacheable
        } finally {
            System.out.print("Finished!");}
        return null;
    }
    public static void main(String[] things) {
        System.out.print(getFullName("Joyce","Hopper"));
    }
}

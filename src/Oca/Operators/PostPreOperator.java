package Oca.Operators;

public class PostPreOperator {

    public static void main(String[] args)
    {
        // Declaring a custom variable
        int pre = 20;
        int post = 10;
        // Printing the above variable
        System.out.println("Pre = " + ++pre);
        System.out.println("Post = " + post++);
        System.out.println("after");
        System.out.println("Pre = " + pre);
        System.out.println("Post = " + post);
    }
}

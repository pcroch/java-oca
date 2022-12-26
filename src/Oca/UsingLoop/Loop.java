package Oca.UsingLoop;

public class Loop {
    private static int count;
    private static String[] stops = new String[] { "Washington",
            "Monroe", "Jackson", "LaSalle" };
    public static void main(String[] args) {
        while (count < stops.length) {
            System.out.println(count);

                System.out.println(++count);
            System.out.println(count);
            }
        }

    }


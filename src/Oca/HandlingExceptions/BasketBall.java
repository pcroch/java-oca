package Oca.HandlingExceptions;

import java.lang.reflect.Executable;

public class BasketBall {
    public static void main(String[] dribble) {
        try {
            System.out.println(1);
            throw new ClassCastException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(2);
        } catch (ArithmeticException ex) {
            System.out.println(3);
        } catch (Exception ex) {
            System.out.println("3a");
        } catch (Throwable ex) {
            System.out.println(32);
        } finally {
            System.out.println(4);
        }
        System.out.println(5);
    }
}

package Oca.HandlingExceptions;

import java.io.IOException;

public class WhackAnException {
    public static void main(String... hammer) {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        } catch (Exception e) {
//            throw new IOException();


        }
//        catch (RuntimeException e) {
//            throw new NullPointerException();
//        } finally {
//            throw new RuntimeException();
//        }
    }
}

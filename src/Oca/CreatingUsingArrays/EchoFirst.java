package Oca.CreatingUsingArrays;

import java.util.*;

public class EchoFirst {

    public static void main(String[] args) {
        String one = args[0];
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, one);
        System.out.println(result);
    }
// resultat = 1

}


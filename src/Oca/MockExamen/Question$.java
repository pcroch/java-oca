package Oca.MockExamen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question$ {
    public static void main(String[] args) {
        int[] crossword [] = new int[10][20];
        for (int i = 0; i < crossword.length; i++)
            for (int j = 0; j < crossword[i].length; j++)
                crossword[i][j] = 'x';
        System.out.println(crossword.length);
        System.out.println(Arrays.toString(crossword[6]));
    }
}

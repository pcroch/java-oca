package OpenSourceTraining.Exercice2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution2 {
    private int leftArray[];
    private int rightArray[];

    public int solution(int[] A) {
        Arrays.sort(A);
        int min = A[0];
        int max = A[A.length-1];
        return max- min;
    }



    public static void main(String[] args) {
//        int[] arr = {1,  -3, 3};
        int[] arr = {4,3,2,5,1,1};
        System.out.println(new Solution2().solution(arr));
    }
}

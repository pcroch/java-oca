package OpenSourceTraining.Exercice1;

import java.util.Arrays;


class Solution {
    public int solution(int A, int B) {
        int solution = 0;
        String[] arr = Integer.toBinaryString(A * B).split("");
        for (String s : arr) {
            if(Integer.parseInt(s) == 1) solution += 1;
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution('5','9'));
    }
}



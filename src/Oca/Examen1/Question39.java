package Oca.Examen1;

public class Question39 {

    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        for( int n = 0; n <= arr.length; n += 1) {
            if (n % 2 == 0) {
                System.out.println(n);
                continue;

            }
            System.out.print(arr[n]); //Line n1
        }
    }
}

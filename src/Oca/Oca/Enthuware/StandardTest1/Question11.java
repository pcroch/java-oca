package Oca.Oca.Enthuware.StandardTest1;

public class Question11 {

    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};

        String newStr="";
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }

        System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));

    }
}


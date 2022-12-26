package Oca.Oca.Enthuware.StandardTest3;

public class Question4 {


    public float parseFloat(String s){
//        System.out.println(11111);
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return 5;
        }
        finally { System.out.println("finally");
            return 9 ; // bad practices as it hiddes everything!!!!
            }
//        return f ; // unreachable bcse of the return statement!

    }

    public static void main(String[] args) {
        System.out.println(new Question4().parseFloat("!"));
    }
}

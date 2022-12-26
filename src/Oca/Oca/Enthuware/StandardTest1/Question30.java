package Oca.Oca.Enthuware.StandardTest1;

public class Question30 {
    public static int[ ] getArray() {  return null;  }
    public static void main(String[] args){
        int index = 0;
        try{
            getArray()[index=1]--;
        }
        catch (Exception e){  }  //empty catch
        System.out.println("index = " + index);
    }
}

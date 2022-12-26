package Oca.Oca.Enthuware.StandardTest1;

public class Question35 implements IInt{
    public static void main(String[] args){
        Question35 s = new Question35();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4
    }
}
interface IInt{
    int thevalue = 0;
}

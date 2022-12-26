package Oca.Oca.Enthuware.StandardTest3;

    class Base{
    void methodA(){
        System.out.println("base - MethodA");
    }
}

class Question48 extends Base{
    public void methodA(){
        System.out.println("Question48 - MethodA");
    }
    public void methodB(){
        System.out.println("Question48 - MethodB");
    }
    public static void main(String args[]){
        Base b=new Question48(); //1
        b.methodA(); //2
        Question48 c = (Question48) b; //3
        c.methodB();
    }
}

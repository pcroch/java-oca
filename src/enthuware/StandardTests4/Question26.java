package enthuware.StandardTests4;

class SuperClass{
    public SuperClass(int a){}

    public SuperClass(){}
}

class SubClass extends SuperClass{
    int i, j, k;
    public SubClass( int m, int n )     {  i = m ;  j = m ;  } //1
    public SubClass( int m )  {   super(m );   } //2


}
public class Question26 extends SubClass{

    Question26() {
        super(10);
//        super();
    }

    public static void main(String[] args) {

    }
}

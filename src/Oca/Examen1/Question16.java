package Oca.Examen1;

public class Question16 {

    char var1;
    double var2;
    float var3;
    final static  int var5;
    static {
        var5=5;
    }
    public int test(){
        final int var4;
        var4 = 5;
        return var4;
    }

    public static void main(String[] args) {
        Question16 obj = new Question16();
        System.out.println(">" + obj.var1);
        System.out.println(">" + obj.var2);
        System.out.println(">" + obj.var3);
        System.out.println(">" + obj.test());
    }
}

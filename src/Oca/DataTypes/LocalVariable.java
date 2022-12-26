package Oca.DataTypes;

public class LocalVariable {
    static String name;
    String buble, firstname="aa";
    public static String print(){
        return "Default value of String name: "+ name;
    }

    public static void main(String... args) {
        String chair=null, table = "metal";
        LocalVariable lv = new LocalVariable();
        Integer test = 0;
        double d1 = 5f;
        double d2 = 1;
        d2 = d1+d2;
        table = lv.buble;
        chair = chair + table + test;
//        System.out.println("d2: "+ d2);
//        System.out.println(chair);
//        System.out.println("default value static "+ LocalVariable.print());
//        System.out.println("default value "+ lv.buble + " "+ lv.firstname);

        int k = 0;
        for (int i = 10; i > 0; i--) {
            System.out.println("i.1= "+ i);
            while (i > 3) {i -= 3 ;
                System.out.println("i= "+ i);}
            k += 1;
        }
        System.out.println("k= " + k);


    }

}

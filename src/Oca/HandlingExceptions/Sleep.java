package Oca.HandlingExceptions;

public class Sleep {
    public static void snore() throws Exception {
        try {
            String sheep[] = new String[3];
            System.out.print(sheep[3]);
        } catch (RuntimeException e) {
            System.out.print("Awake!");
            throw e;
        } finally {
            System.out.println("Finally");
            throw new Exception();
        }

    }
    public static void main(String... sheep) throws Exception {  // x2
//        try {
            new Sleep().snore();  // x3
//            }
//            catch(Exception ee){
//                System.out.println("Exception!!!! in main");
//
//        }
    }
}

package Oca.WorkigWithSelectedClasses;

public class RadicalRobots {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("radical ");
//        sb = new StringBuilder("radical").append("robots");
       sb =  new StringBuilder("radical ").insert(7, "robots");


        System.out.print(sb);
    }
//    StringBuilder sb = new StringBuilder("radical ");

}

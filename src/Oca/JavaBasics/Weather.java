package Oca.JavaBasics;

public class Weather {
    public boolean heatWave1 = true;
    private static boolean heatWave = true;
    public static void main(String... arg) {
        boolean heatWave2 = false;
        Boolean w1 = new Weather().heatWave1;
        Weather w = new Weather();
        System.out.println(w.heatWave1);
        System.out.print(heatWave);
    }

}

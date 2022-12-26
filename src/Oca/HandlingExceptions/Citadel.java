package Oca.HandlingExceptions;

class CastleUnderSiegeException extends Exception {}
class KnightAttackingException extends CastleUnderSiegeException {}
public class Citadel {
    public void openDrawbridge() throws RuntimeException, CastleUnderSiegeException {  // q1
        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            throw new ClassCastException();
        } finally {
//            throw new CastleUnderSiegeException();  // q2
            System.out.println(12);
        }
    }
    public static void main(String[] moat) throws CastleUnderSiegeException {
        new Citadel().openDrawbridge();  // q3
    }
}

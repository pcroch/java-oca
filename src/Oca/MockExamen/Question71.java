package Oca.MockExamen;

import java.time.Month;

class OpenDoorException extends Exception {}
class CableSnapException extends OpenDoorException {}
public class Question71 {
    public void openDrawbridge() {
        try {
            throw new OpenDoorException();
        } catch (CableSnapException e) {

        } catch (OpenDoorException ex) {
            System.out.println(ex);
        } finally {
            try {
                throw new OpenDoorException();
            } catch (Exception a) {
            } finally {
                System.out.println("Almost done");
            }

        }
    }
    public static void main(String[] moat) throws Exception {
        new Question71().openDrawbridge();
    }
}

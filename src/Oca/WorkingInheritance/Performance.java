package Oca.WorkingInheritance;

interface SpeakDialogue { default int talk() { return 7; } }
interface SingMonologue { default int talk() { return 5; } }
public class Performance implements SpeakDialogue, SingMonologue {
    public int talk() {
        return 5;
    }
    public static void main(String[] notes) {
//        System.out.print(new Performance().talk(notes));
    }
}

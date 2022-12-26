package Oca.Examen5;

import java.io.IOException;

class SQLException extends Exception{}
 class SQLWarning extends SQLException {}
interface Multiplier {
    void multiply(int... x) throws SQLException;
}

class Calculator implements Multiplier {
    public void multiply(int... x) throws Error {

    }
}
public class Question46 {
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator(); //Line n1
            obj.multiply(1, 2, 3);
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}

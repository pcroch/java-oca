package Oca.Examen5;

import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
       try{
           save();
           log();
       }
       catch(IOException | SQLException ex){

       }
    }

    private static void save() throws IOException {}

    private static void log() throws SQLException {}
}

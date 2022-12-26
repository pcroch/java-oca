package Oca.Examen4;

import java.io.*;

class ReadTheFile {
    static void print() throws IOException { //Line 4
        throw new IOException(); //Line 5
    }
}

public class Question1 {
    public static void main(String[] args) throws IOException { //Line 10
   try{
       ReadTheFile.print();
   } catch(IOException e){
       e.printStackTrace();
   }
    }
}

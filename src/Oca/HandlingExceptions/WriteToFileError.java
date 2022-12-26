package Oca.HandlingExceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileError {
    public static void writeToFile()  {
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
        bw.write("Test");
        bw.close();}
        catch (IOException e){
            System.out.println("hello");
        }
    }

    public static void main(String[] args)  {
        writeToFile();
    }
}

package Oca.HandlingExceptions;

import java.io.*;
class Backup {
    void performBackup() throws FileNotFoundException {
        try {
            throw new IOException("Disk not found");
        } catch (Exception e) {

//            try {
            System.out.println("hello expetion");
                throw new FileNotFoundException("File not found");
//            } catch (FileNotFoundException et) {  // z1
//                System.out.print("Failed");
//            }
        }
    }
    public static void main(String... files) throws FileNotFoundException {
        new Backup().performBackup();  // z2
    }
}
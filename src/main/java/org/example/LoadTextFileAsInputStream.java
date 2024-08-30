package org.example;

import java.io.FileInputStream;
import java.io.InputStream;

public class LoadTextFileAsInputStream {
    public static void main(String[] args) {
        try {

            InputStream input = new FileInputStream("input.txt");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }

        // Load Java File as InputStream
        try {

            // file Test.java is loaded as input stream
            InputStream input = new FileInputStream("Time.java");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }

    }
}

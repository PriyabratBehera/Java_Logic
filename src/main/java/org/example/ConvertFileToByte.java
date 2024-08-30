package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ConvertFileToByte {
    public static void main(String[] args) {
        // File to byte[]
        String path = System.getProperty("user.dir") + "\\src\\test.txt";

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            System.out.println(Arrays.toString(encoded));
        } catch (IOException e) {

        }

        // byte[] to file
        String path1 = System.getProperty("user.dir") + "\\src\\test.txt";
        String finalPath = System.getProperty("user.dir") + "\\src\\final.txt";

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path1));
            Files.write(Paths.get(finalPath), encoded);
        } catch (IOException e) {

        }
    }
}

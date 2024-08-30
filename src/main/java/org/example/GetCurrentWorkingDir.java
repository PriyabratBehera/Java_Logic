package org.example;

public class GetCurrentWorkingDir {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");

        System.out.println("Working Directory = " + path);
    }
}

package org.example;

import java.util.Scanner;

public class EnterByUser {
    public static void main(String[] args) {
        // Enter number by user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println("You entered: " + number);

        //Enter string by user
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc1.nextLine();
        System.out.println("You entered: " + name);

    }
}
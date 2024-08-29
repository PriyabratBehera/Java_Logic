package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter  number: ");
//        int num=sc.nextInt();
//        int pow=(int)Math.pow(num,2);
//        System.out.println(pow);

        // using for loop
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter  number: ");
        int num1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("enter  exponent: ");
        int pow1=sc2.nextInt();
        int p=num1;
        for(int i=1;i<=pow1;i++){
            num1*=p;
        }
        System.out.println(p);
    }
}

package org.example;

import java.util.Scanner;

public class PrimeNumberPrint {
    public static void main(String[] args) {
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                System.out.println(num +" is composite number");
                break;
            }
        }
        if(isPrime){
            System.out.println(num +" is prime number");
        }
    }
}

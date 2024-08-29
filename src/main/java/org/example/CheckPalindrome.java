package org.example;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int originalNum=num;
        int rev=0;
        while(originalNum!=0){
            int rem=originalNum%10;
            rev=rev*10+rem;
            originalNum/=10;
        }
        if(num==rev){
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
    }
}

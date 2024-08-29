package org.example;

import java.util.Scanner;

public class CheckArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int originalNum=num;
        int digit=0;
        while(originalNum!=0){
            originalNum/=10;
            digit++;
        }
        int originalNum1=num;
        int isArmstrong=0;
        while(originalNum1!=0){
            int rem=originalNum1%10;
            isArmstrong+=(int)Math.pow(rem,digit);
            originalNum1/=10;
        }
        if(isArmstrong==num){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num+" is not an armstrong number");
        }

    }
}

package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                numbers.add(i);
            }
        }
        for(int arr:numbers){
            System.out.print(arr+", ");
        }
    }
}

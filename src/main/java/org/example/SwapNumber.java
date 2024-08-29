package org.example;

public class SwapNumber {
    public static void main(String[] args) {

        // Using temp variable
        int first=34, second=45;
        int temp=first;
        first=second;
        second=temp;

        System.out.println("first should be: "+ first + " and second should be: "+second);

        // Without using temp variable
        int first1=34, second1=76;
        int sum=first1+second1;
        first1=sum-first1;
        second1=sum-second1;

        System.out.println("first should be: "+ first1 + " and second should be: "+second1);
    }
}

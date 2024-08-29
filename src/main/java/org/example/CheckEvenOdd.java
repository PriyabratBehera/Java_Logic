package org.example;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int num=51;
        if(num%2==0){
            System.out.println(num + " is even number");
        }
        else{
            System.out.println(num + " is odd number");
        }

        // Check even or odd using ternary operator
        String evenOdd=(num%2==0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
    }
}

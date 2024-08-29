package org.example;

public class CalculateSum {
    public static void main(String[] args) {
        int []arr={12,23,34,45,67,78,89};
        int sum=0;
        for(int eachNum:arr){
            sum=sum+eachNum;
        }
        System.out.println(sum);
    }
}

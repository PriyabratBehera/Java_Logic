package org.example;

public class FindLargestNumInArray {
    public static void main(String[] args) {

        int []arr={12,34,17,98,45};

        int large=arr[0];
        for(int num:arr){
            if(large<num){
                large=num;
            }
        }
        System.out.println("Largest element ="+large);
    }
}

package org.example;

import java.util.Arrays;

public class AscendingDescendingArray {
    public static void main(String[] args) {
        //descending order
//        int[] arr = {26, 56, 32, 9, 90, 87, 65};
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int ascendArray:arr){
//            System.out.println(ascendArray);
//        }
//
//        // Ascending order
//        int[] arr1 = {26, 56, 32, 9, 90, 87, 65};
//        int temp1 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp1 = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp1;
//                }
//            }
//        }
//        for(int ascendArray:arr1){
//            System.out.println(ascendArray);
//        }

        // Using Array object
        int[] arr2 = {26, 56, 32, 9, 90, 87, 65};
        Arrays.sort(arr2);
        for(int ascendArray:arr2){
            System.out.println(ascendArray);
        }

    }
}

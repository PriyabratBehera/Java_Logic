package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        // List to Array
        ArrayList<Object> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("ArrayList: " + languages);

        String[] arr = new String[languages.size()];

        languages.toArray(arr);
        System.out.print("Array: ");
        for(String item:arr) {
            System.out.print(item+", ");
        }

        // Array to List
        String[] array = {"Java", "Python", "C"};
        System.out.println("Array: " + Arrays.toString(array));

        // convert array to list
        List languages1= new ArrayList<>(Arrays.asList(array));
        System.out.println("List: " + languages1);

    }
}

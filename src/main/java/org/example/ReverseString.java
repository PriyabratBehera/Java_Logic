package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        // converting string to StringBuffer object
        String str="Priyabrat";
        StringBuffer g=new StringBuffer(str);
        g.reverse();
        System.out.println(str);

        // using for loop
        String str1="Priyabrat";
        for(int i=str1.length()-1;i>=0;i--){
            System.out.print(str1.charAt(i));
        }
    }
}

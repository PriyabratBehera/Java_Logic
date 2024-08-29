package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=67779988;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);

        // converting string
        int num1=67779988;
        String s=Integer.toString(num1);
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}

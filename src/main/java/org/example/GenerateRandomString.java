package org.example;

import java.util.Random;

public class GenerateRandomString {
    public static void main(String[] args) {
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);

        // generate a random alphanumeric string
        // create a string of uppercase and lowercase characters and numbers
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

        // create random string builder
        StringBuilder sb1 = new StringBuilder();

        // create an object of Random class
        Random random1 = new Random();

        // specify length of random string
        int length1 = 10;

        for(int i = 0; i < length1; i++) {

            // generate random index number
            int index = random1.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);

            // append the character to string builder
            sb1.append(randomChar);
        }

        String randomString1 = sb1.toString();
        System.out.println("Random String is: " + randomString1);


    }
}

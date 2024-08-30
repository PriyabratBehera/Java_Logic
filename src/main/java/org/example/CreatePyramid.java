package org.example;

public class CreatePyramid {
    public static void main(String[] args) {

        // Half pyramid
        for(int i=10;i>0;i--){
            for(int j=i-1;j<10;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted half pyramid
        int rows1 = 5;
        for (int i = rows1; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // full pyramid
        int rows2 = 5, k = 0;
        for (int i = 1; i <= rows2; ++i, k = 0) {
            for (int space = 1; space <= rows2 - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        // Inverted full pyramid
        int rows3 = 5;
        for(int i = rows3; i >= 1; --i) {
            for(int space = 1; space <= rows3 - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }


        int rows = 4; // Number of rows in the pyramid
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }

            // Print stars and spaces between them
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}

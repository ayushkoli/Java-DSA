package Basics;

import java.math.BigInteger;

public class CategorizeBoxAccordingtoCriteria {
    public static void main(String[] args) {


        System.out.println(categorizeBox(92487,6200,58423,40));

    }
    public static String categorizeBox(int length, int width, int height, int mass) {
        // Calculate volume of the box as a long to avoid integer overflow
        long volume = (long) length * width * height;
        String box;
        // Check if box is both Bulky and Heavy
        // Bulky: any dimension >= 10,000 OR volume >= 1,000,000,000
        // Heavy: mass >= 100
        if ((length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000L) && mass >= 100) {
            box = "Both";
        }
        // Check if box is only Bulky
        else if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000L) {
            box = "Bulky";
        }
        // Check if box is only Heavy
        else if (mass >= 100) {
            box = "Heavy";
        }
        // If neither Bulky nor Heavy
        else {
            box = "Neither";
        }
        // Return the final category
        return box;
    }

}

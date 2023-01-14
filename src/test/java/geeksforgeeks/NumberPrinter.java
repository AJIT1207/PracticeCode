package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class NumberPrinter {
    public static void main(String[] args) {
        String original = "amazon";

// Extract the two middle characters from the original string
        String middle = original.substring(2, 6);

// Append the middle characters to the beginning and end of the string
        String rotated = middle.concat(original.substring(0, 2));

        System.out.println(rotated);

// Check if the original string is equal to the rotated string
        if (original.equals(rotated)) {
            System.out.println("The string is rotated by two places");
        } else {
            System.out.println("The string is not rotated by two places");
        }

    }
}
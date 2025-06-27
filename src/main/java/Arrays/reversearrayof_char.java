package Arrays;

import java.util.Arrays;

public class reversearrayof_char {
    public static void main(String[] args) {

        char[] s={'a','b','c','d'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    // This function reverses a character array by swapping elements
    public static void reverseString(char[] s) {
        // Set up two pointers: one at the beginning, one at the end
        int start = 0;              // Points to first element (index 0)
        int end = s.length - 1;     // Points to last element (index 3 for array of size 4)

        // Keep swapping elements until the pointers meet in the middle
        while(start < end) {
            // Swap the characters at start and end positions
            swap(s, start, end);

            // Move start pointer forward (towards right)
            start++;

            // Move end pointer backward (towards left)
            end--;
        }
        // When start >= end, we've swapped all pairs and the array is reversed
    }

    // Helper function to swap two elements in the array
    public static void swap(char[] s, int index1, int index2) {
        // Store the first element in a temporary variable
        char temp = s[index1];

        // Put the second element in the first position
        s[index1] = s[index2];

        // Put the first element (from temp) in the second position
        s[index2] = temp;

        // Now the two elements have been swapped!
    }
}
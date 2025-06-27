package Arrays;

import java.util.Arrays;

public class arrayreverse {

        public static void main(String[] args) {
            int[] arr={1,5,3,2};
            rev(arr);
            System.out.println(Arrays.toString(arr));
//            reverse(arr);
//            System.out.println(Arrays.toString(arr));


        }
    public static void rev(int[] array){
        // Loop only through the first half of the array
        // This prevents double-reversal and is more efficient
        for (int i = 0; i < array.length/2; i++) {

            // Declare variables for the swap operation
            int temp, start, end;
            // Get the element at current position (from left side)
            start = array[i];
            // Get the corresponding element from the opposite end
            // array.length-1-i calculates the mirror position
            // Example: if array has 4 elements and i=0, this gives index 3
            //          if i=1, this gives index 2
            end = array[array.length - 1 - i];

            // Store current element in temp (this line is actually not needed)
            temp = array[i];

            // Perform the swap:
            // Put the right-side element into the left position
            array[i] = end;

            // Put the left-side element into the right position
            array[array.length - 1 - i] = start;

            // No break needed since we only loop through half the array
        }
    }

    /*
     * Example walkthrough with array [1, 2, 3, 4]:
     *
     * i=0: swap array[0] and array[3] → swap 1 and 4 → [4, 2, 3, 1]
     * i=1: swap array[1] and array[2] → swap 2 and 3 → [4, 3, 2, 1]
     *
     * Loop stops at i=2 because 2 >= 4/2
     * Final result: [4, 3, 2, 1] ✓ (correctly reversed)
     */
        public static void reverse(int[] array){
            int start=0;
            int end=array.length-1;
            while(start<end){
                swap(array,start,end);
                start++;
                end--;
            }
        }



        public static void swap(int[] array,int index1,int index2){
            int temp=array[index1];
            array[index1]=array[index2];
            array[index2]=temp;

        }

}

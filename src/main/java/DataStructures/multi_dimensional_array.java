package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class multi_dimensional_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] arr=new int[3][];
        int[][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2={  //column size doesn't matter as they are individual arrays
                {1,2,3,4},     //0th index arr2[0]
                {5,6},         //1st index ...
                {7,8,9,10,11}  //2nd index ...
        };
        int[][] array=new int[3][2];

        //input
        for (int row = 0; row < array.length ; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column]=s.nextInt();
            }
            
        }
        //output
        for (int row = 0; row < array.length ; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }

        for(int row=0;row<array.length;row++){
            System.out.println(Arrays.toString(array[row]));
        }

        System.out.println();

        for(int[] a:array){              //for each loop-first we use to write the data
                                         // type of array but now we are printing the whole array itself
            //so it means that every single elment itself is a array so the data type is array

            System.out.println(Arrays.toString(a));

        }



    }
}

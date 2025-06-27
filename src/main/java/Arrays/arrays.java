package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        //store 9 roll numbers
        int[] roll1= new int[9];
        //directly storing
        int[] roll2={1,2,3,34,5,55,44};

        int[] rol;
        // Declaration of array, ref variable stored in stack (roll) which is not pointing to anything
        rol=new int[5];
        //Initialization:actual object is created here in the heap memory

        int[] arr1=new int[5];

        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("enter array element for index: "+i); //getting input from user
            arr1[i]=s.nextInt();

        }
        String[] arr2= new String[5];
        for (int i = 0; i <arr2.length ; i++) { //getting input from user
            arr2[i]=s.next();

        }

        for(int i=0;i<arr1.length;i++){      // printing using for loop
            System.out.print(arr1[i]+" ");

        }
        System.out.println();

        for (String str : arr2) {
            System.out.print(str + " "); //foreach loop

        }
        System.out.println();

        System.out.println(Arrays.toString(arr1));  //using array.to string method to print array


    }



}

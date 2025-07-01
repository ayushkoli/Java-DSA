package linear_Search;

import java.util.Arrays;

public class searchingin2Darray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int target=9;

        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int[][] array,int target){
        if(array.length==0){
            System.out.println("enpty array");
        }
        for(int row=0;row<array.length;row++){
            for(int column=0;column<array[row].length;column++){
                if(array[row][column]==target){
                    return  new int[]{row, column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

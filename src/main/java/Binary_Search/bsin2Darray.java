package Binary_Search;

import java.util.Arrays;

public class bsin2Darray {
    public static void main(String[] args) { //matrix is sorted in row wise and column wise
        int[][] a={
                {10,20,30},
                {11,21,31},
                {12,22,32}

        };
        System.out.println(Arrays.toString(search(a,31)));

    }
    public static int[] search(int[][] matix,int target){
        int r=0;
        int c=matix.length-1;
        while(r<matix.length && c>=0){
            if(matix[r][c]==target){
                return new int[]{r,c};
            }
            if(target>matix[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}

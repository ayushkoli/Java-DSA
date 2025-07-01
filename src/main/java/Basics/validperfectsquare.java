package Basics;

import java.util.Scanner;

public class validperfectsquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));

}
    public static boolean isPerfectSquare(int num) {
        if(num<2){
            return true;

        }
        long start=0;
        long end=num/2;

        while(start<=end){
            long mid= start+(end-start)/2;
            if(mid*mid==num){
                return true;
            } else if (mid*mid>num) {
                end=mid-1;

            } else if (mid*mid<num) {
                start=mid+1;

            }
        }
        return false;
    }
}

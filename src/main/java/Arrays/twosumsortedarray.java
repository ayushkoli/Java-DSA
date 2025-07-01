package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twosumsortedarray {
    public static void main(String[] args) {
        int[] a={-10,-8,-2,1,2,5,6};
        System.out.println(Arrays.toString(twoSum(a,0)));

    }
    public static int[] twoSum(int[] nums, int target) {
       int start=0;
       int end=nums.length-1;
       while(start<=end){
           int sum=nums[start]+nums[end];
           if(sum==target){
               return new int[]{start+1,end+1};
           } else if (sum>target) {
               end--;
           }else {
               start++;
           }
       }
       return new int[]{-1,-1};
}
}


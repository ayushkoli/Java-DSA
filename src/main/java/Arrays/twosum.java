package Arrays;
/*1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] a={3,3};
        System.out.println(Arrays.toString(twoSum(a,6)));

    }
        public static int[] twoSum(int[] nums, int target) {
            int[] a=new int[2];
            int t=target;
            for (int i = 0; i < nums.length; i++) {

                target=target-nums[i];
                for (int j = i+1; j < nums.length ; j++) {
                    if(nums[j]==target){
                        a[0]=i;
                        a[1]=j;
                        break;


                    }
                }
                target=t;
            }
            return a;
        }
}

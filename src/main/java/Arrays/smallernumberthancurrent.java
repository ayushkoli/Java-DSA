package Arrays;
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]

import java.util.Arrays;

public class smallernumberthancurrent {
    public static void main(String[] args) {
        int[] a={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(a)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for(int j=0;j< nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            answer[i]=count;
        }

    return answer;
    }
}

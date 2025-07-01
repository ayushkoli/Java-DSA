package Arrays;

public class singlenumber {
    public static void main(String[] args) {
        int[] a={2,2,1,3,3,1,7};
        System.out.println(singleNumber(a));

    }
    public static int singleNumber(int[] nums) {
        int temp=0;
        int single=0;
        for (int i = 0; i < nums.length; i++) {

            int start=0;
            while (start<nums.length){
                if(start==i){
                    if(start==nums.length-1){
                        start++;
                        break;
                    }
                    start++;
                }
                if(nums[start]==nums[i]){
                    break;
                }else {
                    start++;
                }
            }
            if(start==nums.length){
                return nums[i];
            }
        }
        return -1;

    }
}

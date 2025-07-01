package Arrays;

public class maxcountofpositivenegative {
    public static void main(String[] args) {
        int[] a={-1,-2,2,3,4};
        System.out.println(maximumCount(a));

    }
    public static int maximumCount(int[] nums) {
        int pcount=0;
        int ncount=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                pcount++;
            }
            if(nums[i]<0){
                ncount++;
            }

        }
        if(ncount>=pcount){
            return ncount;
        }
        return pcount;

    }
}

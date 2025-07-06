package Binary_Search;

public class splitarray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(splitArray(a,2));

    }
    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start, nums[i]);
            end=end+nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int piece=1;
            int sum=0;
            for(int n:nums){
                if(sum+n>mid){
                    sum=n;
                    piece++;
                }else{
                    sum+=n;
                }
            }
            if(piece>k){
                start=mid+1;
            }else{
               end=mid;
            }
        }
        return end;
    }
}

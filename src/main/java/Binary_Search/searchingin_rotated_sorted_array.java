package Binary_Search;

public class searchingin_rotated_sorted_array {
    public static void main(String[] args) {
        int[] a={2,2,2,3,4,2};


        System.out.println(pivoit(a));

    }
    public static int search(int[] nums,int target){
        int pivoit=pivoit(nums);
        int index1=binarysearch(nums,target,0,pivoit);
        if(index1!=-1){
            return index1;
        }else return binarysearch(nums,target,pivoit+1,nums.length-1);

    }

    public static int pivoit(int[] nums){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1] ){ //in and if 1st case is only false then it wont even check the other case
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]  ){ //i had first wrote nums[mid]<nums[mid-1] && mid>start
                                                  // here it gave me index out of bound error as the second case is not even checked
                return mid-1;
            }
            if(nums[start]==nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }


            else if(nums[start]<nums[mid]||nums[start]==nums[mid] && nums[mid]>nums[end]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;

    }
    public static int binarysearch(int[] array,int target,int start,int end){

        while (start<=end){

            int mid=start+(end-start)/2; //better as (start+end)/2 here
            // start+end can exceed the value of int
            int midvalue=array[mid];

            if(target< midvalue) {
                end = mid - 1;
            } else if (target>midvalue) {
                start= mid + 1;

            }else {
                return mid;
            }
        }
        return -1;
    }

}

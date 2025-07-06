package Binary_Search;

public class searchinginfintearray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        System.out.println(range(a,9));

    }
    public static int range(int[] a,int target){
        int start=0;
        int end=1;
        while (target>end){
            int tempstart=end+1;
            end=end+(end-start+1)*2;
            start=tempstart;
        }
        int ans= binarysearch(a,target,start,end);
        return ans;

    }
    public static int binarysearch(int[] array,int target,int start, int end){

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

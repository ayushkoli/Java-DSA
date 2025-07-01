package Binary_Search;

public class Binary_Search {
    public static void main(String[] args) {
        int[] a={-1,0,1,2,3,4,5,6,7};
        System.out.println(binarysearch(a,88));

    }
    public static int binarysearch(int[] array,int target){
        int start=0;
        int end=array.length-1;
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

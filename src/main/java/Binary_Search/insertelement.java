package Binary_Search;

public class insertelement {
    public static void main(String[] args) {
        int[] a={1,3,5,7};
        System.out.println(searchInsert(a,2));
    }
    public static int searchInsert(int[] array, int target) {
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
        return start;
    }
}

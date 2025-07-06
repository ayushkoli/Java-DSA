package Binary_Search;

public class searchinginmountain {
    public static void main(String[] args) {
        int[] a={1,2,4,45,2,1};
        System.out.println(search(a,3));

    }
    public static int search(int[] array,int target){
        int peak=peak(array);
        int index1=binarysearch(array,target,0,peak);
        int index2=binarysearch(array,target,peak+1,array.length-1);
        if(index1!=-1){
            return index1;
        }
        return index2;


    }
    public static int peak(int[] array){
        int start=0;
        int end=array.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(array[mid]>array[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start; //we can even return end as its the same
    }
    public static int binarysearch(int[] array,int target,int start,int end){

        boolean isAsen;
        if(array[start]<array[end]){
            isAsen=true;
        }else isAsen = false;

        while (start<=end){

            int mid=start+(end-start)/2; //better as (start+end)/2 here
            // start+end can exceed the value of int
            int midvalue=array[mid];
            if(midvalue==target){
                return mid;
            }
            if(isAsen){
                if(target< midvalue) {
                    end = mid - 1;
                } else if (target>midvalue) {
                    start= mid + 1;
                }
            }else {
                if(target< midvalue) {
                    start=mid+1;
                } else if (target>midvalue) {
                    end=mid-1;
                }
            }

        }
        return -1;
    }


}

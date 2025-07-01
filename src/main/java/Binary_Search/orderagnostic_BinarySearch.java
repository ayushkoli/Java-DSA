package Binary_Search;

public class orderagnostic_BinarySearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={9,8,7,6,5,4,3,2,1};
        System.out.println(orderagnosticBS(a,8));
        System.out.println(orderagnosticBS(b,8));

    }
    public static int orderagnosticBS(int[] array,int target){
        int start=0;
        int end=array.length-1;
        boolean isAsen;
        if(array[start]<array[end]){
            isAsen=true;
        }else isAsen = false;

        while (start<=end){

            int mid=start+(end-start)/2;
            int midvalue=array[mid];
            if(target==array[mid]){
                return mid;
            }
            if (isAsen){
                if(target< midvalue) {
                    end = mid - 1;
                } else if (target>midvalue) {
                    start= mid + 1;

                }
            }else {  //for descending sorted array
                if(target> midvalue) {
                    end = mid - 1;
                } else if (target<midvalue) {
                    start= mid + 1;

                }
            }


        }
        return -1;
    }
}

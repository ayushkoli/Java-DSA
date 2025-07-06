package Binary_Search;

import java.util.Arrays;

public class firstandlastoccurance {
    public static void main(String[] args) {
        int[] a={1,2,2,2,4,5};
        System.out.println(Arrays.toString(searchRange(a,2)));

    }
        public static int[] searchRange(int[] nums, int target) {
            int[] a={-1,-1};
            int start=binary(nums,target,true);
            int end=binary(nums,target,false);
            a[0]=start;
            a[1]=end;
            return a;

        }
        public static int binary(int[] array,int target,boolean isStart){
            int start=0;
            int end=array.length-1;
            int ans=-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(array[mid]>target){
                    end=mid-1;
                }else if(array[mid]<target){
                    start=mid+1;
                }else{
                    ans=mid;
                    if(isStart){
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }

    }


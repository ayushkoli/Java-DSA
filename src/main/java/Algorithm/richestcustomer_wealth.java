package Algorithm;

public class richestcustomer_wealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,4},
                {2,3,5}
        };
        System.out.println(maximumWealth(arr));


    }
    public static int maximumWealth(int[][] accounts) {

        int max=0;
        int[] arr=new int[accounts.length];
        for(int row=0;row<accounts.length;row++){
           int rowmax=0;
            for(int column=0;column<accounts[row].length;column++){
                rowmax=rowmax+accounts[row][column];
            }
            if(rowmax>max){
                max=rowmax;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//
//        }
        return max;

    }
}

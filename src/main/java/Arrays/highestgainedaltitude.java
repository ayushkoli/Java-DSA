package Arrays;

public class highestgainedaltitude {
    public static void main(String[] args) {
        int a[]={-5,1,5,0,-7};
        System.out.println(largestAltitude(a));

    }
    public static int largestAltitude(int[] gain) {
        int max=0;
        int altitude=0;
        for (int i = 0; i < gain.length; i++) {
            altitude=altitude+gain[i];
            if(altitude>max){
                max=altitude;
            }

        }
        return max;

    }
}

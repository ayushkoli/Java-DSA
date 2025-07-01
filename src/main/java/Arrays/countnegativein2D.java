package Arrays;

public class countnegativein2D {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {-1,-2,-3},
                {3,4,5}
        };
        System.out.println(countNegatives(a));

    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if(grid[row][column]<0){
                    count++;
                }

            }

        }
        return count;

    }
}

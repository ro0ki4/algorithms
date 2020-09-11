package pan.xu.动态规划;

import java.util.List;

public class 最小路径和 {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 3;
        grid[0][2] = 1;
        grid[1][0] = 1;
        grid[1][1] = 5;
        grid[1][2] = 1;
        grid[2][0] = 4;
        grid[2][1] = 2;
        grid[2][2] = 1;
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid[0].length;i++){
            int flag = 0;
            for(int j = 0; j <= i; j++){
                flag = grid[0][j] + flag;
            }
            dp[0][i] = flag;
        }
        for(int i = 0; i< grid.length;i++){
            int flag = 0;
            for(int j = 0; j <= i; j++){
                flag = flag + grid[j][0];
            }
            dp[i][0] = flag;
        }
        for(int[] i:dp){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 1; i < grid.length; i++){
            for(int j = 1; j < grid[0].length; j++){
                dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
            }
        }
        for(int[] i:dp){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return(dp[grid.length-1][grid[0].length-1]);
    }
}

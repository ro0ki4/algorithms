package pan.面试题.京东;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/27 19:26
 * version 1.0
 */
public class dd2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] tem = new int[n+1][2*n+5];
        int level = 0;
        while(level < n){
            level++;
            tem[level-1][0] = 0;
            tem[level-1][1] = 0;
            for(int i = 0; i < level * 2 -1; i++){
                tem[level-1][i+2] = scanner.nextInt();
            }
            tem[level-1][level*2+1] = 0;
            tem[level-1][level*2+2] = 0;
            scanner.nextLine();
        }


        int[][] dp = new int[n][2*n+5];
        dp[0][2] = tem[0][2];
        for(int i = 1; i < n; i++){
            for(int j = 2; j < 2*i+3; j++){
                int a1 = dp[i-1][j-2];
                int a2 = dp[i-1][j-1];
                int a3 = dp[i-1][j];

                int max = Math.max(Math.max(a1,a2),a3);

                dp[i][j] = max + tem[i][j];
            }
        }
        int res = 0;
        for(int i = 0; i < 2*n+3; i++){

            res = Math.max(dp[n-1][i],res);
        }

        System.out.print(res);

    }

}

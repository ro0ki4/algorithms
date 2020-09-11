package pan.xu.动态规划;

import java.util.HashMap;

public class 不同的子序列 {
    public static void main(String[] args) {
//        HashMap

        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(numDistinct(s, t));
    }

    /**
     * 动态方程
     * dp[i][j]=dp[i-1][j]+(s.charat(i-1)==t.charat(j-1))?dp[i-1][j-1]:0;
     * @param s
     * @param t
     * @return
     */
    static int numDistinct(String s, String t){


        int l1 = s.length();
        int l2 = t.length();
        //dp[i][j]是说明在s字符串的前i个和t字符串的前j个有几种
        int[][] dp = new int[l1+1][l2+1];
        //边界条件
        for(int i=0;i<l1+1;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<l1+1;i++){
            for(int j=1;j<l2+1;j++){
                dp[i][j] = dp[i - 1][j] + (s.charAt(i - 1) == t.charAt(j - 1) ? dp[i-1][j-1] : 0);
                //dp[i][j] = dp[i][j - 1] + (s.charAt(i - 1) == t.charAt(j - 1) ? 1 : 0);
            }
        }
        return dp[l1][l2];
    }
}

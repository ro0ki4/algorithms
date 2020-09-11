package pan.xu.动态规划;

public class 硬币 {
    public static void main(String[] args) {
        System.out.println(waysToChange(900750));
    }
    public static int waysToChange(int n) {
        int mod = 1000000007;
        //dp[i][j]用i中面值换取j元钱的方法
        //dp[i][j] = dp[i-1][j-0*max]+dp[i-1][j-1*max]......直到j-x*max<max
        long[][] dp = new long[4][n+1];
        int[] money = {1,5,10,25};
        for(int i = 0; i < n+1; i++){
            dp[0][i] = 1;
        }
        for(int i = 0; i < 4; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i < 4; i++){
            int value = money[i];
            for(int j = 1; j < n+1; j++){
                int sum = 0;
                for(int k = 0; j-k*value >= 0; k++){
                    sum += dp[i-1][j-k*value];
                }
                dp[i][j] = sum;
            }
        }
        return (int)dp[3][n]%mod;
    }
}

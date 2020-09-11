package pan.xu.动态规划;

public class 买卖股票的最佳时机 {
    public static void main(String[] args) {

    }

    /**
     * dp[i][j]在第j天经过I次交易
     * dp[i][j] = MAX(dp[i][j],dp[i-1][j-2]+prices[j-1]-prices[j-2];
     * @param prices
     * @return
     */
    static int maxProfit(int[] prices){
        int[][] dp = new int[3][prices.length];
        for(int i=1;i<prices.length;i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<3;i++){
            for(int j=1;j<prices.length;j++){
                dp[i][j] = Math.max(0, 1);
            }
        }
        return 0;
    }
}


package pan.xu.动态规划;

public class 零钱的最少张数 {
    static int[] a = {1,5,10,25};
    public static void main(String[] args) {
        System.out.println(solution(900750));
    }

    static int solution(int money){
        int[][] dp = new int[5][money+1];

        for(int i = 1; i < 5; i++){
            for(int j = 1; j < money+1; j++){
                int k = j/a[i-1];
                dp[i][j] = dp[i-1][j-k*a[i-1]]+k;
            }
        }
        return dp[4][money];
    }

}

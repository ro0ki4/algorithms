package pan.xu.动态规划;

public class 整型数组中寻找一个最大的子串 {
    public static void main(String[] args) {
        int[] c = {3,1,-7,-3,4,1,-3,4,4};
        System.out.print(solution(c));
    }


    static int solution(int[] a){
        int[] dp = new int[a.length+1];
        dp[0] = 0;
        for(int i = 1; i < a.length+1; i++){
            dp[i] = (dp[i-1]>0?dp[i-1]:0)+a[i-1];
        }
        return dp[a.length];
    }
}

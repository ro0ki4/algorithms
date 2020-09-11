package pan.xu.动态规划;

public class 不同路径1 {
    static int num = 0;
    public static void main(String[] args) {
        int a[][] =new int[3][3];
        solution(a, 0, 0);
        System.out.println(num);
        System.out.println(solution2(3, 3));
        System.out.println(uniquePaths(3, 3));
    }


    public static void solution(int[][] a,int m,int n){

        if(m>=a.length)
            return;

        if(n>=a[0].length)
            return;

        if(m==a.length-1&&n==a[0].length-1){
            num++;
            return;
        }
        //向右走一格
        solution(a,m+1,n);
        //向下走一格
        solution(a,m,n+1);
    }

    static int solution2(int m,int n){
        int[][] dp =new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n+1;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m-1][n-1];
    }

    static public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

}

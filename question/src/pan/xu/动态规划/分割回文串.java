package pan.xu.动态规划;

public class 分割回文串 {
    public static void main(String[] args) {
        String s = "aabbccddeeffaaaff";
        System.out.println(minCut(s));
    }

    /**
     * dp[i][j]用来判断字符串i到j是否为回文串
     * @param s
     * @return
     */
    static int minCut(String s){
        int l = s.length();
        int[] num = new int[l];
        boolean[][] dp = new boolean[l][l];

        for (int j = 0; j < l; j++) {
            num[j] = j;
            for (int i = 0; i <= j; i++) {
                //判断i到j是否是回文串
                if(s.charAt(i)==s.charAt(j)&&(j-i<2||dp[i+1][j-1])){
                    dp[i][j]=true;
                    //最小的次数
                    //num[j] = Math.min(num[j],num[i-1]+1);
                    num[j] = i == 0 ? 0 : (Math.min(num[j], num[i - 1] + 1));
                }
            }
        }
        return num[l - 1];
    }
}

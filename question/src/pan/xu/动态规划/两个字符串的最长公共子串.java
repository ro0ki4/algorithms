package pan.xu.动态规划;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class 两个字符串的最长公共子串 {
    public static void main(String[] args) {
        String s1 = "sabcdees";
        String s2 = "abcsd";
        A heh = new A();
        System.out.println(heh.solution(s1, s2));
        System.out.println(heh.sss);
    }
}

class A{

    String sss = "";
    /**
     * dp[i+1][j+1] = dp[i][j] + 1     s1[i+1] == s2[j+1]
     *              = dp[i+1][j]       s1[i+1] t and s2[j+1] f
     *              = dp[i][j+1]       s1[i+1] f and s2[j+1] t
     * @param s1
     * @param s2
     * @return
     */
    public int solution(String s1, String s2){
        if(s1.equals(s2))
            return s1.length();
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        for(int i = 0; i < dp[0].length; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i < s1.length()+1; i++){
            boolean flag = true;
            int hehe = -1;
            for(int j = 1; j < s2.length()+1; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(hehe < j-1 && flag) {
                        sss = sss + s2.charAt(j-1);
                        hehe = j;
                        flag = false;
                    }
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        

        return dp[s1.length()][s2.length()];
    }
}

package pan.xu.动态规划;

public class 交错字符串 {

    static int sum=0;
    public static void main(String[] args) {
        String s1 = "db";
        String s2 = "b";
        String s3 = "cbb";
        System.out.println(isInterleave(s1, s2, s3));
        long time1 = System.currentTimeMillis();
        System.out.println(solution(s1, s2, s3));
        System.out.println(System.currentTimeMillis() - time1);
        System.out.println(sum / 10000);
    }

    static boolean isInterleave(String s1, String s2, String s3){
        //超出时间限制
        sum++;
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        if(l1+l2!=l3)
            return false;
        if(l1==0&&l2==0&&l3==0)
            return true;
        if(l3==0&&(l2!=0||l1!=0))
            return false;

        if(l1>0&&l2>0){
            if(s3.charAt(l3-1)==s1.charAt(l1-1)&&s3.charAt(l3-1)==s2.charAt(l2-1)){
                return isInterleave(s1.substring(0, l1 - 1), s2, s3.substring(0, l3 - 1))||
                        isInterleave(s1, s2.substring(0, l2 - 1), s3.substring(0, l3 - 1));
            }
        }


        if(l1>0) {
            if (s3.charAt(l3 - 1) == s1.charAt(l1 - 1))
                return isInterleave(s1.substring(0, l1 - 1), s2, s3.substring(0, l3 - 1));
        }
        if(l2>0) {
            if (s3.charAt(l3 - 1) == s2.charAt(l2 - 1))
                return isInterleave(s1, s2.substring(0, l2 - 1), s3.substring(0, l3 - 1));
        }
        return false;
    }

    static boolean solution(String s1, String s2, String s3){
        //动态规划，代表s1的前i个和s2的前j个可以是s3的前i+j个的交错字符串
        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();

        if(l1+l2!=l3)
            return false;


        boolean dp[][] = new boolean[l1 + 1][l2 + 1];
        dp[0][0]=true;
        //行的初值
        for(int j=1;j<l2+1;j++)
            dp[0][j] = dp[0][j - 1] && s2.charAt(j-1) == s3.charAt(j-1);
        for (int i = 1; i < l1 + 1; i++)
            dp[i][0] = dp[i-1][0]&&s1.charAt(i-1)==s3.charAt(i-1);
        for(int i=1;i<l1+1;i++){
            for(int j=1;j<l2+1;j++){
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                        (dp[i][j - 1] && s2.charAt(j-1) == s3.charAt(i + j - 1));
            }
        }
        return dp[l1][l2];
    }
}

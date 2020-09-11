package pan.xu.动态规划;

import java.util.Arrays;

public class 恢复空格 {
    public static void main(String[] args) {
        String[] dic = new String[]{"looked","just","like","her","brother"};
        String sen = "jesslookedjustliketimherbrother";
        System.out.println(solution(dic,sen));
    }
    static int solution(String[] dictionary, String sentence){
        trim aa = new trim();
        for(String s : dictionary){
            aa.insert(s);
        }
        int len = sentence.length();
        int[] dp = new int[len+1];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0] = 0;
        for(int i = 1; i < len+1; i++){
            dp[i] = dp[i-1]+1;
            trim a = aa;
            for(int j = i-1; j >= 0; j--){
                trim b = a.next[sentence.charAt(j)-'a'];
                if(b == null)
                    break;
                if(b.isEnd){
                    dp[i] = Math.min(dp[i],dp[j]);
                }
                a = b;
            }
        }
        return dp[len];
    }


}
class trim{
    trim[] next;
    boolean isEnd;
    public trim(){
        next = new trim[26];
        isEnd = false;
    }

    public void insert(String s){
        trim cur = this;
        for(int i = s.length()-1; i >= 0; i--){
            int index = s.charAt(i)-'a';
            if(cur.next[index] == null)
                cur.next[index] = new trim();
            cur = cur.next[index];
        }
        cur.isEnd = true;
    }
}
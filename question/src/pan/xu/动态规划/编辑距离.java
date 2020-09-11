package pan.xu.动态规划;

public class 编辑距离 {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "dhoesr";
        System.out.println(solution(word1, word2, word1.length()-1, word2.length()-1));
        System.out.println(solution2(word1, word2));
    }

    /**
     * 利用递归实现动态规划
     *
     * @param word1
     * @param word2
     * @param m
     * @param n
     * @return
     */
    static int solution(String word1, String word2,int m,int n){
        if(word1.length()*word2.length()==0)
            return word1.length()+word2.length();
        if(m==0&&n==0) {
            if(word1.charAt(0)==word2.charAt(0))
                return 0;
            else
                return 1;
        }
        if(m==0)
            return n ;
        if(n==0)
            return m ;
        if(word1.charAt(m)==word2.charAt(n)){
            return solution(word1, word2, m - 1, n - 1);
        } else {
            int flag = 0;
            flag = (1 + solution(word1,word2,m-1,n-1))>
                    (1+solution(word1,word2,m-1,n))
                    ?(1+solution(word1,word2,m-1,n))
                    :(1 + solution(word1,word2,m-1,n-1));

            flag = flag > (1+solution(word1,word2,m,n-1))
                    ?(1+solution(word1,word2,m,n-1))
                    :flag;
            return flag;

        }
    }

    /**
     * 非递归实现动态规划
     * @param word1
     * @param word2
     * @return
     */
    static int solution2(String word1, String word2){
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] flag = new int[l1+1][l2 + 1];
        //两个边界条件
        for(int i=1;i<l1+1;i++){
            flag[i][0]=i;
        }
        for(int j=1;j<=l2;j++){
            flag[0][j]=j;
        }

        for(int i=1;i<l1+1;i++){
            for(int j=1;j<l2+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    flag[i][j] = flag[i - 1][j - 1];
                }
                else {
                    flag[i][j] = Math.min(Math.min(flag[i - 1][j - 1], flag[i][j - 1]), flag[i - 1][j])+1;
                }
            }
        }
        return flag[l1][l2];
    }
}

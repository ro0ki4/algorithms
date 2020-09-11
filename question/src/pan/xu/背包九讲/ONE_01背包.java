package pan.xu.背包九讲;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ro0ki4
 * @data 2020/7/23 23:04
 * version 1.0
 */
public class ONE_01背包 {
    public static void main(String[] args) {
        int v = 9;
        int n = 4;
        int[] qua = new int[]{2,2,3,4};
        int[] val = new int[]{2,4,5,10};
        //std::out 10 -> 22 9 ->
        System.out.println(solution(v, n, qua, val));
        Set<Integer> dd = new HashSet<>();
        dd.add(1);
        dd.add(2);
        dd.add(3);
        dd.add(4);
        for(int i : new HashSet<Integer>(dd)){
            System.out.print(i+"  ");
            dd.remove(i);
        }
    }

    /**
     *
     * @param v 体积
     * @param n 数量
     * @param qua 质量
     * @param val 价值
     */
    public static int solution(int v, int n, int[] qua, int[] val){
        int[][] dp = new int[n+1][v+1];
        for(int i = 1; i < n+1; i++){
            for(int j = qua[i-1]; j < v+1; j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-qua[i-1]]+val[i-1]);
            }
        }
        return dp[n][v];
    }
}

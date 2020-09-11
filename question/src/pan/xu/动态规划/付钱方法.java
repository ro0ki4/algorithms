package pan.xu.动态规划;

import java.util.*;

public class 付钱方法 {
    public static void main(String[] args) {


        System.out.println(solution(money, 900750));
        System.out.println(solution2(money, 100));
//        Integer[] a = new Integer[10];
//        for(int i = 0; i < a.length; i++){
//            a[i] = i;
//        }
//        Arrays.sort(a,new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1>o2)
//                    return -1;
//                if(o1<o2)
//                    return 1;
//                if(o1==o2)
//                    return 0;
//                return 0;
//            }
//        });
//        for(int i:a){
//            System.out.println(i);
//        }
//        HashMap<Integer,String> aa = new HashMap();
//        aa.put(3, "3");
//        aa.put(2, "2");
//        aa.put(1, "1");
//        for(String value:hehe(aa).values()){
//            System.out.println(value);
//        }
    }

    static int[] money = {1, 5, 10, 25};

    /**
     * dp[i][j]使用前i种面值来组成j面值有dp[i][j]种方法
     * dp[i][j] = dp[i-1][j-1*max]+dp[i-1][j-2*max]+.......
     * @param money
     * @param x
     * @return
     */

    static int solution(int[] money,int x){
        int l = money.length;
        int[][] dp = new int[l+1][x+1];
        dp[0][0] = 1;
        for(int j=0;j<l;j++){
            dp[j][0] = 1;
        }

        for(int i=1;i<=l;i++){
            for(int j=1;j<=x;j++){
                for(int k=0;k<=(j/money[i-1]);k++){
                    dp[i][j] = dp[i][j]+dp[i-1][j-k*money[i-1]];
                }
            }
        }
        return dp[l][x];
    }


    static int solution2(int[] money, int num){
        int l = money.length;
        int [][]dp = new int[l+1][num+1];
        //初始化边界条件
       for(int j=1;j<num+1;j++){
           dp[1][j]=j;
        }
        //组成金额为0的方法只有一种
        for(int i=1;i<l;i++){
            dp[i][0]=1;
        }
        dp[0][0]=1;

        for(int i=1;i<l+1;i++){
            for(int j=1;j<num+1;j++){
                dp[i][j]=0;
                for(int k=0;k<=j/money[i-1];k++){
                    dp[i][j] += dp[i - 1][j - k * money[i - 1]];
                }
            }
        }
        return dp[l][num];

    }

    static HashMap<Integer,String> hehe(HashMap<Integer,String> tarmap){
        Integer[] arr = tarmap.keySet().toArray(new Integer[tarmap.size()]);
        Arrays.sort(arr);
        HashMap<Integer,String> resMap = new LinkedHashMap();
        for(Integer value: arr){
            resMap.put(value,tarmap.get(value));
        }
        return resMap;
    }
}

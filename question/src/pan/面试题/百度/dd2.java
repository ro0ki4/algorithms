package pan.面试题.百度;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/9/3 19:59
 * version 1.0
 */
public class dd2 {
    public static int sum  = 0;
    public static int mod = 1000000007;
    public static  HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        //int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
        int n = 100;
        int m = 5;

        long start = System.currentTimeMillis();
        System.out.println(hh(n, m, 0, 0));
        System.out.println("use time: "+ (System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        dfs(n,m,0,0);
        System.out.println("val = "+ sum + " use time: " + (System.currentTimeMillis() - start));


    }

    public static void dfs(int n, int m, int x,int y){
        if(n == 0){
            sum = (sum+1)%mod;
            return;
        }
        if(n < 0)
            return;
        if(n > 0){
            for(int i = 1; i <= m; i++){
                if(i == x || i == y)
                    continue;
                //if(map.keySet(n,x,y,))
                dfs(n-i,m,y,i);
            }
        }
    }

    public static int hh(int n, int m, int x,int y){

        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        if(n > 0){
            if(map.keySet().contains(""+n+x+y)){
                return map.get(""+n+x+y);
            }
            int val = 0;
            for(int i = 1; i <= m; i++){
                if(i == x || i == y)
                    continue;
                val += hh(n-i,m,y,i)%mod;
            }
            map.put(""+n+x+y,val%mod);
            return val%mod;
        }
        return 0;
    }
}





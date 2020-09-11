package pan.面试题.百度;

import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/9/3 19:59
 * version 1.0
 */
public class DD3 {
    public static int sum  = 0;
    public static int mod = 1000000007;
    public static void main(String[] args) {
        //int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //
        dfs(n,m,0,0);
        System.out.print(sum);

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
                if(i > n)
                    break;

                dfs(n-i,m,y,i);
            }
        }
    }

    public static int hh(int n, int m,int x,int y){
        //if()
            if(n == 0){
                return 1;
            }
        if(n < 0){
            return 0;
        }
        if(n > 0){
            int val = 0;
            for(int i = 1; i<= m; i++){
                if(i == x|| i == y)
                    continue;
                val += hh(n,m,y,i);
            }
            return val;
        }
        return 0;
    }
}

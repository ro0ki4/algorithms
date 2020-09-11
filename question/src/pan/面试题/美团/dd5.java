package pan.面试题.美团;

import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/15 17:40
 * version 1.0
 */
public class dd5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int val = 1;
        int[] res = new int[1];
        dfs(n,m,val,res);
        System.out.print(res[0]);
    }
    public static void dfs(int n,int m,int val,int[] res){
        if(val > n)
            return;
        if(m == 0){
            res[0]++;
            return;
        }
        for(int i = 1; i <= n/val; i++){
            dfs(n,m-1,val*i,res);
        }
    }
}

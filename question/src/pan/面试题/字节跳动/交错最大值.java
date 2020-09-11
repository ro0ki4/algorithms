package pan.面试题.字节跳动;

import java.util.*;

/**
 * @author ro0ki4
 * @data 2020/8/10 9:31
 * version 1.0
 */
public class 交错最大值 {
    public static void main(String[] args) {

        int[] ww = new int[3];

        StringBuilder s = new StringBuilder();
        String ss = new String();
        ss = ss+'a';
        System.out.println(Integer.MAX_VALUE);
        System.out.println(-1 >>>1);
        System.out.println(-1&1);
        System.out.println(5^2);
        System.out.println(~-2);
//        de.push(2);


        System.out.println(-1 >> 20);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tem = new int[n];
        for(int i = 0; i < n; i++){
            tem[i] = scan.nextInt();
        }
        int max = 0;
        int cur = 0;
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(flag){
                cur += tem[i];
                flag = false;
            }else{
                flag = true;
                cur -= tem[i];
            }
            if(cur < 0){
                flag = true;
                i --;
                cur = 0;
            }
            max = Math.max(max,cur);
        }
        System.out.println(max);
    }
}

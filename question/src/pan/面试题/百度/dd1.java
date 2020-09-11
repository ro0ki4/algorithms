package pan.面试题.百度;

import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/9/3 18:59
 * version 1.0
 */
public class dd1 {
    public static void main(String[] args) {
        long a = 5555555550l;
        System.out.println(a%9);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tem = new int[n];
        int sum5 = 0;
        int sum0 = 0;
        for(int i = 0; i < n; i++){
            tem[i] = scanner.nextInt();
            if(tem[i] == 0)
                sum0++;
            else
                sum5++;
        }
        if(sum5>=9 && sum0 >= 1){
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < sum5-sum5%9; i++){
                res.append(5);
            }
            for(int i = 0; i < sum0; i++){
                res.append(0);
            }
            System.out.print(res.toString());
        }
        else
            System.out.print(-1);
    }
}

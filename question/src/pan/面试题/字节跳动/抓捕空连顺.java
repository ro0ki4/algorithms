package pan.面试题.字节跳动;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/9 10:37
 * version 1.0
 */
public class 抓捕空连顺 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        ArrayList<Integer> tem = new ArrayList<>();
        int[] res = new int[]{0};
        for(int i = 0;i < n; i++){
            tem.add(scan.nextInt());
        }
        long start = System.currentTimeMillis();
        int[] local = new int[3];
        dfs(res,d,0,local,tem,0);
        System.out.print(res[0]);
        System.out.println("时间是" + (System.currentTimeMillis() - start));
    }

    static void dfs(int[] res, int d, int time, int[] local, ArrayList<Integer> tem, int index){
        if(time ==3){
            if(local[2] - local[0] <= d){
                res[0] = (res[0]+1)%99997867;
            }
            return;
        }

        for(int i = index; i < tem.size(); i++){
            local[time] = tem.get(i);
            if(time >= 1 && local[time]-local[0] > d){
                return;
            }
            dfs(res,d,time+1,local,tem,i+1);
            //local[time] = 0;
        }
    }
}

package pan.面试题.广联达;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/7/22 15:34
 * version 1.0
 */
public class 排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = scan.nextInt();
            //int[] nums = new int[n];
            ArrayList<Integer> nums = new ArrayList<>();

            for(int i = 0; i < n; i++){
                nums.add(scan.nextInt());
            }
            //每次都找一个最大的提过去
            int sum = 0;
            while(true) {
                int val = -1;
                boolean flag = true;
                for (int i = nums.size() - 1; i >= 0; i--) {
                    if (nums.get(i) != i+1) {
                        val = nums.get(i);
                        nums.remove(i);
                        sum++;
                        nums.add(0,val);
                        break;
                    }
                    if(i == 0){
                        flag = false;
                    }
                }
                if(!flag){
                    break;
                }
            }
            System.out.print(sum);
        }
    }
}

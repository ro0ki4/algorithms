package pan.面试题.广联达;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/7/22 11:43
 * version 1.0
 */
public class 头条校招 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = scan.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = scan.nextInt();
            }
            Arrays.sort(nums);
            
        }
    }

}

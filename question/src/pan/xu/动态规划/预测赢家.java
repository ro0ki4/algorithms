package pan.xu.动态规划;

import com.sun.org.apache.xpath.internal.axes.PredicatedNodeTest;

/**
 * @author ro0ki4
 * @data 2020/9/1 9:01
 * version 1.0
 */
public class 预测赢家 {
    public static void main(String[] args) {
        Fuck hh = new Fuck();
        int[] nums = new int[]{1,5,2};
        System.out.println(hh.PredictTheWinner(nums));
    }
}


class Fuck {
    public boolean PredictTheWinner(int[] nums) {
        int res1 = 0;
        int res2 = 0;
        int res = tool(nums,0,nums.length-1);
        System.out.println(res);
        return res >= 0;
    }

    //dp[i][j] = Math.max(nums[i]+)
    public int tool(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }
        if(left > right){
            return 0;
        }
        int l = nums[left] - tool(nums,left+1,right) ;
        int r = nums[right] - tool(nums,left,right-1);
        return Math.max(l,r);
    }
}
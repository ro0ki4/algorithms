package pan.xu.排序艘索;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author ro0ki4
 * @data 2020/8/10 10:49
 * version 1.0
 */
public class 非递归二分查找 {
    public static void main(String[] args) {
        
        int[] nums = new int[] {2,  5,  8, 12, 19};
        
        int left = 0;
        int right = nums.length-1;
        int target = 5;
        while(true){
            if(left >= right){
                if(nums[left] == target){
                    System.out.println(true);
                }
                break;
            }
            int mid = (left+right)>>1;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        System.out.println("over");
    }
}

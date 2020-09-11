package pan.xu.堆栈;

import java.util.*;

/**
 * @author ro0ki4
 * @data 2020/9/10 20:49
 * version 1.0
 */
public class 单调栈 {
    public static void main(String[] args) {

        char[] d = new char[]{'a','b','c'};
        List<Integer> hh = new ArrayList<>();
        hh.add(1);
        hh.add(2);


        System.out.println(hh.toString());
        System.out.println(Arrays.toString(d));
        int[] test = new int[]{5,3,1,2,4};
        for(int i :tool(test)){
            System.out.println(i);
        }

    }

    /**
     * 寻找到比当前数大的第一个数的下标
     * @param nums
     * @return
     */
    public static int[] tool(int[] nums){
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        Deque<Integer> que = new LinkedList();
        for(int i = 0; i < res.length; i ++){
            while( que.size() > 0 && nums[que.peek()] < nums[i]){
                res[que.pop()] = i;
            }
            que.push(i);
        }


        return res;
    }
}

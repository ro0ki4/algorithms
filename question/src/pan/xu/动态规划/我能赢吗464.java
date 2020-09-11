package pan.xu.动态规划;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ro0ki4
 * @data 2020/7/24 16:54
 * version 1.0
 */
public class 我能赢吗464 {
    public static void main(String[] args) {
        System.out.println(canWin(10, 20));
        //System.out.println(canIWin(10, 11));
    }
    public static boolean canWin(int max,int total){
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i < max+1; i++){
            set.add(i);
        }
        return tool(total,set);
        //return false;
    }
    public static boolean tool(int total, Set<Integer> set){
        //都在尽力寻找到ture的方案
        if(total <= 0)
            return false;
        for(int i : new HashSet<Integer>(set)){
            set.remove(i);
            boolean flag = tool(total-i,set);
            set.add(i);
            System.out.println(i);
            if(!flag)
                return true;
        }
        return false;
    }




    /**
     * 暴力回溯
     * */
    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        //稳赢
        if (desiredTotal <= maxChoosableInteger) return true;
        //打平
        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal) return false;
        boolean[] isV = new boolean[maxChoosableInteger + 1];
        return recur(maxChoosableInteger, desiredTotal, isV);
    }

    private static boolean recur(int maxChoosableInteger, int desiredTotal, boolean[] isV) {
        //通知上层，本层是失败的
        if (desiredTotal <= 0) return false;
        //这是跳出循环条件
        //首先，最终肯定是要回到第一次调用的for循环，也就是A第一个选的数，所以for中被截断肯定return ture才行
        //当前层需要知道上层的情况，因此返回上层的结果
        for (int i = 1; i <= maxChoosableInteger; i++) {
            if (isV[i]) continue;
            isV[i] = true;
            boolean last = recur(maxChoosableInteger, desiredTotal - i, isV);
            isV[i] = false;
            //上层没赢，这层才能返回这层的结果ture，截断for循环(因为这层选小的都赢了，那选更大的也肯定赢了)
            if (!last) return true;
        }
        //如果for循环走完了，没被截断，说明当前层的选择，都是失败的
        //(放到第一个选择的人身上，就是false，放到第二个人身上，那就是会回溯到第一个人身上，那第一个人会返回true)
        return false;
    }
}

package pan.xu.杂七杂八;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public static void main(String[] args) {
        int[] aa = {-1, 0, -1, 2, -2, 1, -4,-5,3};
        int[] bb = {0, 0, 0};
        int[] cc = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(solution(cc));
        for (int i : cc) {
            System.out.print(i + " ");
        }
    }

    static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3) return lists;
        Arrays.sort(nums);

        int L;
        int R;
        for (int i = 0; i < nums.length; i++) {
            L = i + 1;
            R = nums.length - 1;
            while (true) {
                if (L >= R) break;
                if (nums[i] + nums[L] + nums[R] == 0) {
                    lists.add(Arrays.asList(nums[i], nums[L], nums[R]));

                    while(L<nums.length-1){
                        if(nums[L]==nums[L+1])
                            L++;
                        else break;
                    }
//                    while (nums[R] == nums[R - 1]) {
//                        R--;
//                    }
                    while(R>L+1){
                        if(nums[R]==nums[R-1])
                            R--;
                        else break;
                    }

                    L++;
                    R--;
                } else if (nums[i] + nums[L] + nums[R] < 0) {
                    L++;
                } else if (nums[i] + nums[R] + nums[L] > 0) {
                    R--;
                }
            }
            while(i<nums.length-1){
                if(nums[i]==nums[i+1])
                    i++;
                else break;
            }
        }
        return lists;
    }
}

package pan.xu.杂七杂八;

import java.util.Arrays;

public class 最接近的三数之和 {
    public static void main(String[] args) {
        int[] aa = {-1, 2, 1, -4};
        int[] bb = {1, 1, 1, 1};
        int[] cc = {1,1,-1,-1,3};
        System.out.println(solution(cc, -1));
        for (int i : cc) {
            System.out.print(i + "  ");
        }
    }

    static int solution(int[] nums, int target) {
        if (nums.length == 3) return nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int sum = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (true) {
                if (l >= r) break;
                int flag = (nums[i] + nums[l] + nums[r] - target) > 0 ? (nums[i] + nums[l] + nums[r] - target) : -(nums[i] + nums[l] + nums[r] - target);
                if (sum > flag) {
                    sum = flag;
                    res = nums[i] + nums[l] + nums[r];
                }
                if (nums[i] + nums[l] + nums[r] == target)
                    return res;

                if (nums[i] + nums[l] + nums[r] - target > 0) r--;
                else if (nums[i] + nums[l] + nums[r] - target < 0)
                    l++;
                if(l>=r)
                    break;

            }
        }
        return res;
    }
}

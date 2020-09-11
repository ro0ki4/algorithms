package pan.xu.贪心算法;

public class 跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 1, 2, 5};
        int[] nums2 = {1, 2, 3};
        System.out.println(jump(nums2));
    }

    static int jump(int[] nums){
        if(nums.length == 1)
            return 0;
        if(nums[0]>=nums.length)
            return 1;
        int time = 0;
        int flag = 0;
        while(true) {
            time++;
            if(flag+nums[flag]>=nums.length-1)
                break;
            flag = judge(flag, nums[flag], nums);
            //System.out.println(flag+"----");

        }
        return time;
    }
    static int judge(int start,int length, int[] nums){
        int value = -1;
        int local = 0;
        for (int i = start+1; i <= start + length; i++) {
            if(nums[i]+i>value){
                value = nums[i]+i;
                local = i;
            }
        }
        return local;
    }
}

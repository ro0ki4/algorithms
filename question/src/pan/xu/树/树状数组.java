package pan.xu.树;


public class 树状数组 {
    public static void main(String[] args) {
        树状数组 aa = new 树状数组();
        int[] test = new int[101];
        for(int i = 1; i < 101; i++){
            aa.updata(test,i,i);
        }
        for(int s : test){
            System.out.println(s);
        }

        System.out.println(aa.getAddition(test, 100));
    }


    private int lowBit(int x){
        return x&-x;
    }

    public void updata(int[] nums, int index, int addition){
        int len = nums.length;
        if(index == 0)
            return;

        while(index < len) {
            nums[index] += addition;
            index += lowBit(index);
        }
    }

    public int getAddition(int[] nums, int index){
        int res = 0;
        while(index > 0){
            res += nums[index];
            index -= lowBit(index);
        }
        return res;
    }
}

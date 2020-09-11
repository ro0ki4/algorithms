package pan.xu.杂七杂八;

public class 寻找重复树 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5};
        int[] b = {1,1,2,3,4,5};
        //System.out.println(findDuplicate(a));
        System.out.println(findDuplicate(a));
    }

    public static int findDuplicate(int[] nums){
        int len = nums.length;
        int left = 1;
        int right = len-1;
        while(true){
            if(left>=right)
                return left;
            int mid = (left+right)>>1;
            int flag = 0;
            for(int val: nums){
                if(val <= mid)
                    flag++;
            }
            if(flag>mid){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
    }
}



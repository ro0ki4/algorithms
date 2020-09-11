package pan.xu.排序艘索;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {

        char b = 'a';
        char c = 'b';
        System.out.println( c >= b+1);


        int[] a = {3,3,5,2,6,7,3,9,1,5,4};
        int[] ss = {1,2,3,1};
        String[] dd = {"1", "2", "3", "1"};
        solu(ss,0,ss.length-1);
        fastSort(dd,0,dd.length-1);
        //Arrays.sort(ss);
        for(int aa :ss){
            System.out.print(aa);
        }
        System.out.println();
        for(String ee : dd){
            System.out.print(ee);
        }

    }

    static void solu(int[] nums,int l,int r){
        if(l>=r)
            return;
        int index= nums[l];
        int low = l;
        int high = r;
        while(low < high){
            while(nums[high] >= index && high >low)
                high--;
            while(nums[low] <= index && high > low)
                low++;
            if(high > low) {
                nums[high] = nums[low] + nums[high];
                nums[low] = nums[high] - nums[low];
                nums[high] = nums[high] - nums[low];
            }
        }
        nums[l] = nums[high];
        nums[high] = index;

        solu(nums,l,high);
        solu(nums,high+1,r);

    }

    public static void fastSort(String[] nums,int left,int right){
        if(left >= right)
            return;
        int l = left;
        int r = right;
        String mid = nums[left];
        while(l < r){
            while((nums[r]+mid).compareTo(mid+nums[r]) >= 0 && r > l){
                r--;
            }
            while((nums[l]+mid).compareTo(mid+nums[l]) <= 0 && r > l){
                l++;
            }
            if(l < r){
                String tem = nums[l];
                nums[l] = nums[r];
                nums[r] = tem;
            }
        }
        //String tem = nums[left];
        nums[left] = nums[r];
        nums[r] = mid;
        fastSort(nums,left,r);
        fastSort(nums,r+1,right);
    }
}

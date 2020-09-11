package pan.xu.贪心算法;

public class 拼接最大数 {
    public static void main(String[] args) {

    }

    /**
     * 在num1中抽出i个数，num2中抽出k-i个数
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */
    static int[] maxNumber(int[] nums1, int[] nums2,int k){
        int l1 = nums1.length;
        int l2 = nums2.length;
        int sum = Integer.MIN_VALUE;
        if(k >= l1 &&k >=l2){
            //k的取值大于任何一个数组的长度
            for(int i = (k - (l1 > l2 ? l2 : l1));i < (l1 > l2 ? l2 : l1);i++){
                sum = sum >= getNumber(nums1,nums2,i,k-i) ? sum : getNumber(nums1,nums2,i,k-i);
            }
        } else{
            //k的取值小于其中一个数组的长度
            //k的取值小于两个数组的长度
        }
        return new int[0];
    }

    /**
     * 找出num1中按顺序最大的i个数，num2中按顺序最大的j个数
     * @param nums1
     * @param nums2
     * @param i
     * @param j
     * @return
     */
    static int getNumber(int[] nums1, int[] nums2,int i,int j){
        int[] local = new int[i];
        int[] value = new int[i];
        local[0] = getMax(nums1, 0, i + 1)[1];
        value[0] = getMax(nums1, 0, i + 1)[0];
        //编写一个寻找一个数组从i到j最大值的方法
        for(int i1 = 1; i1 < i; i1++){
            local[i1] = getMax(nums1, local[i1 - 1], nums1.length - i + i1 + 1)[1];
            value[i1] = getMax(nums1, local[i1 - 1], nums1.length - i + i1 + 1)[0];
        }

        return 0;
    }

    /**
     * 寻找一个数组从下标i到j的最大值和它的下标
     * @param num
     * @param i
     * @param j
     * @return
     */
    static int[] getMax(int[] num,int i,int j){
        //返回的为值和值所在的下标值
        int[] var = new int[2];
        var[0] = Integer.MIN_VALUE;
        var[1] = 0;
        for(int k=i;k<j;k++){
            if(var[0] < num[k]){
                var[0] = num[k];
                var[1] = k;
            }
        }
        return var;
    }

    /**
     * 返回两个数组组合起来的最大值
     * @param num1
     * @param num2
     * @return
     */
    static int getMaxNumber(int[] num1, int[] num2){
        int l1 = num1.length;
        int l2 = num2.length;
        int i = 0;
        int j = 0;
        int[] arr = new int[l1 + l2];
        while(true){
            if (i > l1 - 1 || j > l2 - 1){
                break;
            }
            arr[i+j] = num1[i]>num2[j]?num1[i++]:num2[j++];
        }

        if(i>l1-1){
            while(i+j>arr.length-1){
                arr[i + j] = num2[j++];
            }
        } else{
            while(i+j>arr.length-1){
                arr[i + j] = num1[i++];
            }
        }

        String s = null;

        for(int i1 : arr){
            s = i1 + "";
        }
        return Integer.parseInt(s);
    }
}

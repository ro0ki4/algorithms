package pan.xu.排序艘索;

/**
 * @author ro0ki4
 * @data 2020/9/7 20:40
 * version 1.0
 */
public class 堆排序 {

    public static void main(String[] args) {
        int[] test = new int[]{2,5,1,4,6,8,9,3,7};
        sort(test);
        for(int i : test){
            System.out.print(i+"  ");
        }
    }

    /**
     * 堆排序是完全二叉树，子节点和父节点满足 parent[i] -> children[2*i+1] .  children[2*i+2]
     *                                        children[i] = parent[(i-1)/2]
     * @param arr
     */

    private static void sort(int[] arr){
        //将数组转为大顶堆
        heapify(arr);

        for(int i : arr){
            System.out.print(i+"  ");
        }
        System.out.println();
        //取出最大值，调整大顶堆
        for(int i = arr.length-1; i > 0; i--){
            swap(arr,0,i);
            adjustHeap(arr,0,i);
        }

    }

    private static void heapify(int[] arr){
        for(int i = (arr.length-2)/2; i >= 0; i--){
            adjustHeap(arr,i,arr.length);

        }

    }

    /**
     *
     * @param arr 表示为代表完全二叉树的序列
     * @param i  表示需要调整的节点下标
     * @param length 当前数组的场景长度
     */
    private static void adjustHeap(int[] arr, int i, int length){
        int val = arr[i];
        for(int k = 2*i+1; k < length; k = k*2+1){
            if( k+1 < length && arr[k] < arr[k+1])
                k++;
            if(val < arr[k]){
                arr[i] = arr[k];
                i = k;
            }else
                break;
        }
        arr[i] = val;
    }

    private static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

}

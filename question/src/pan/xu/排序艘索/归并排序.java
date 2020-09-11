package pan.xu.排序艘索;

public class 归并排序 {
    public static void main(String[] args) {
        int[] a = {3,2,5,2,6,7,3,9,1,5,4};
        hh(a,0,a.length-1);
//        for(int h:a){
//            System.out.println(h);
//        }
    }

    static void hh(int[] nums,int i,int j){
        if(i>=j)
            return;
        hh(nums,i,(i+j)/2);
        hh(nums,(i+j)/2+1,j);
        he(nums,i,(i+j)/2,(i+j)/2+1,j);
    }

    static void he(int[] nums,int i, int j, int ii, int jj){
        int[] arr = new int[jj-i+1];
        int s = i;
        int k = 0;
        while(i<=j && ii <= jj){
            arr[k] = nums[i]>nums[ii]?nums[ii++]:nums[i++];
            k++; 
        }
        if(i>j){
            while(ii<=jj){
                arr[k++] = nums[ii++];
            }
            for(int a = 0; a < k; a++){
                nums[a+s] = arr[a];
            }
        }else{
            while(i<=j){
                arr[k++] = nums[i++];
            }
            for(int a = 0; a < k; a++){
                nums[a+s] = arr[a];
            }
        }
        for(int bb:arr){
            System.out.println(bb);
        }
        System.out.println("+++++++++++++++++++++++++++");
    }

}

/*
package pan.xu;
public class Solution {
    public static void main(String[]args){
        int[] height=new int[]{2,1,5,6,2,3};
        int squre=maxsqure(height);
    }
    static int maxsqure(int[]height){
        //int example=0;
        int[] sample=new int[height.length];
        int[] sample1=new int[height.length];
        int flag=100;
        int flaglocal=0;
        int j=0;
        while(j<height.length) {
            for (int i = 0; i < height.length; i++) {
                if (flag > height[i]&&sample1[i]==0) {
                    flag=height[i];
                    flaglocal = i;
                }
            }
            flag=100;
            sample1[flaglocal]=1;
            sample[j] = flaglocal;
            j++;
        }
        int returnresult;
        for(int i=0;i<sample.length;i++){
            returnresult= height[sample[i]]*back(i);
        }
        return 1;
    }
    static int back(int flag){
        for(int )
    }

}


 */


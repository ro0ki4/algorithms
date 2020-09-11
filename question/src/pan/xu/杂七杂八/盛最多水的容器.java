package pan.xu.杂七杂八;

public class 盛最多水的容器 {
    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(solution(a));
    }

    static int solution(int[] height){
        if(height.length<=1){
            return 0;
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            for(int j=0;j<height.length;j++){
                if ((height[i] > height[j] ? height[j] : height[i]) * (i > j ? (i - j) : (j - i))>sum) {
                    sum=(height[i] > height[j] ? height[j] : height[i]) * (i > j ? (i - j) : (j - i));
                }
            }
        }
        return sum;
    }
}

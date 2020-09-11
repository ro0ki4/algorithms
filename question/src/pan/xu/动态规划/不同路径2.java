package pan.xu.动态规划;

public class 不同路径2 {
    static int num = 0;
    public static void main(String[] args) {
        int[][] a = {{0, 0, 1}, {0, 1, 0}, {0, 0, 0}};
        solution(a, 0, 0);
        System.out.println(num);
    }

    public static void solution(int[][] a,int m,int n){

        if(m>=a.length)
            return;

        if(n>=a[0].length)
            return;

        if(a[m][n]==1)
            return;

        if(m==a.length-1&&n==a[0].length-1){
            num++;
            return;
        }
        //向右走一格
        solution(a,m+1,n);
        //向下走一格
        solution(a,m,n+1);
    }


}

package pan.xu.回溯;

/**
 * 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 *
 * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
 * 第一行: 0
 * 第二行: 01
 * 第三行: 0110
 * 第四行: 01101001
。
 */
public class 第K个语法符号 {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,3));
        System.out.println(solution(4,5)+"  "+solution(2,2)+"  "+solution(2,1));
    }

    static int solution(int n, int k){
        if(k==1)
            return 0;
        else{
            return Math.abs(solution(n-1,k-(int)(Math.pow(2,n-2)))-1);
        }
    }
}

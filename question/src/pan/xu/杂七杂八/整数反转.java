package pan.xu.杂七杂八;

public class 整数反转 {
    public static void main(String[] args) {
        System.out.println(solution(-1534236469));

    }
    static int solution(int num){//未添加溢出检测
        boolean flag=false;
        if(num<0){
            num=-num;
            flag = !flag;
        }
        StringBuilder str = new StringBuilder(num+"");
        String string=str.reverse().toString();
        String aa = flag == true ? "-" + string : string;
        int cc;
        try {
            cc = Integer.parseInt(aa);
        } catch(Exception e) {
            return 0;
        }
        return cc;
    }
}

package pan.xu.杂七杂八;

public class 罗马数字转数字 {
    public static void main(String[] args) {
        System.out.println(solution("MCMXCIV"));
    }

    static int solution(String s){
        if(s.length()<=0)
            return 0;
        int[] arr = {1,5,10,50,100,500,1000};
        String[] brr = {"I", "V", "X", "L", "C", "D", "M"};
        String[] crr = {"IV", "IX", "XL", "XC", "CD", "CM"};
        int[] drr = {4, 9, 40, 90, 400, 900};
        int i=0;
        int sum=0;
        while(true){
            if(i>=s.length())
                break;
            //优先判断是否符合两个字符
            boolean flag=false;
            if(i<=s.length()-2) {//有可能匹配到两个字符
                for (int j = 0; j < crr.length; j++) {
                    if ((s.charAt(i) + "" + s.charAt(i + 1) + "").equals(crr[j])) {
                        //符合两个字符的类型
                        sum += drr[j];
                        i += 2;
                        flag = true;
                        break;
                    }
                }
            }
            //判断是否匹配单个字符
            if(!flag){
                for(int j=0;j<brr.length;j++){
                    if ((s.charAt(i) + "").equals(brr[j])) {
                        sum += arr[j];
                        i+=1;
                        flag=false;
                        break;
                    }
                }
            }
        }
        return sum;
    }
}

package pan.xu.杂七杂八;

public class 整数转罗马数字 {
    public static void main(String[] args) {
        System.out.println(solution(1994));
    }

    static String solution(int num) {
        if(num>=4000) return "";
        int[] arr = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] brr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            int time = num / arr[i];
            for(int j=0;j<time;j++){
                str.append(brr[i]);
            }
            num -= time * arr[i];
        }
        return str.toString();
    }
}

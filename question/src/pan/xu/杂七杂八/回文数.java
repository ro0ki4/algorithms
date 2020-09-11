package pan.xu.杂七杂八;

public class 回文数 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    static boolean solution(int num){
        if(num<0)
            return false;
        StringBuilder str = new StringBuilder(num + "");
        //System.out.println(str);
        String string1=str.toString();
        StringBuilder str2 = str.reverse();
        //System.out.println(str2);
        String string2=str2.toString();
        return string1.equals(string2);
    }
}

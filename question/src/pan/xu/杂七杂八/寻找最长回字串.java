package pan.xu.杂七杂八;

public class 寻找最长回字串 {
    public static void main(String[] args) {
        System.out.println(solution("cbccdc"));
    }


    public static String solution(String s){
        if(s.length()<=0) return "";
        int L=0;
        int R=0;
        for(int i=0;i<s.length();i++){
            int len1=find(s,i,i);
            int len2=find(s,i,i+1);
            int len = len1 > len2 ? len1 : len2;
            if (len > R - L ) {//R-L为之前的最长的字符串的长度
                L = i - (len-1) / 2;
                R = i + (len ) / 2;
            }
        }
        //substring为前闭后开，所以前面的L和R需要略加调整
        return s.substring(L, R+1);
    }

    static int find(String s,int i,int j){
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        //返回符合条件的字符串的长度
        return j-i-1;
    }
}

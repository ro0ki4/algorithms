package pan.xu.杂七杂八;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    static List<String> solution(int n){
        List<String> lists=new ArrayList<>();
        convolution(lists, "", 0, 0, n);
        return lists;
    }

    static void convolution(List<String> list,String str, int l, int r,int n){
        if(str.length()>=2*n+2) {
            list.add(str);
            return;
        }
        if(l<n){
            if(l==0)
                convolution(list,str+"\"(",l+1,r,n);
            else
                convolution(list, str+"(", l + 1, r, n);
        }
        if(l>r){
            if(r==n-1)
                convolution(list, str + ")\"", l, r + 1, n);
            else
                convolution(list, str+")", l, r + 1, n);
        }
    }
}

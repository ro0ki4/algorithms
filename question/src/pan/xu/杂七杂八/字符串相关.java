package pan.xu.杂七杂八;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 字符串相关 {

    static Map<String, Integer> myMap = new HashMap<>();
    static List<String> mylist1 = new ArrayList<>();
    static List<Integer> mylist2 = new ArrayList<>();
    public static void main(String[] args) {

    }

    public static void solution(String str){
        if(str.length()<1) return;
        if(str.length()==1){
            myMap.put(str, myMap.get(str)+1);
            return;
        }
        for(int i = 1; i <str.length(); i++){
            if(str.length()%i!=0)
                continue;
            int flag = str.length()/(1+i);//每段的长度,i+1为被分成的段的数量
            int j = 0;
            String var = str.substring(0, i);
            while(true){
                //判断是否它们都一样
                if(j>i)
                    break;
                if(!str.substring(j*flag,j*flag+flag).equals(var))
                    break;
                 j++;
            }
            //如果它们是一样的话
            if(j>i) {
                myMap.put(str.substring(0, i), myMap.get(str.substring(0, i) + 1));
                return;
            }
            //如果不是一样的
            if(j<=i) {
                solution(str.substring(0, str.length() - 1));
                solution(str.substring(str.length() - 1));
            }
        }
        return;
    }
}

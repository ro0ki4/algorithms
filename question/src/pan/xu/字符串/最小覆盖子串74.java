package pan.xu.字符串;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 最小覆盖子串74 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }

    public static String minWindow(String s, String t) {
        int lens = s.length();
        int lent = t.length();

        if(lens<lent)
            return "";
        int start = 0;
        int end = 0;
        ArrayList<Integer> res = new ArrayList();
        while(true){
            if(jug(s.substring(start,end+1),t)){
                res.add(start);
                res.add(end);
                start ++;
            }else{
                end++;
            }
            if(end>lens-1){
                break;
            }
        }
        if(res.size() == 0){
            return "";
        }
        end = lens;
        for(int i = 0; 2*i < res.size(); i++){
            if(end > res.get(2*i+1)-res.get(2*i)){
                end = res.get(2*i+1)-res.get(2*i);
                start = res.get(2*i);
            }
        }

        return s.substring(start,start+end+1);
    }

    static boolean jug(String s, String t){
        int lens = s.length();
        int lent = t.length();
        if(lens<lent)
            return false;
        Map<Character,Integer> maps = new HashMap();
        Map<Character,Integer> mapt = new HashMap();
        for(int i = 0; i < lens; i++){
            maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i < lent; i++){
            mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i = 0; i < lent; i++){
//            if(mapt.get(t.charAt(i)) > maps.get(t.charAt(i)))
//                return false;
            if(mapt.getOrDefault(t.charAt(i),0) > maps.getOrDefault(t.charAt(i),0))
                return false;
        }
        return true;
    }
}



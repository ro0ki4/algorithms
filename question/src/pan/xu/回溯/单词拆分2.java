package pan.xu.回溯;

import java.util.ArrayList;
import java.util.List;

public class 单词拆分2 {
    public static void main(String[] args) {
        String s = "xupand";
        List<String> mylist = new ArrayList<>();
        mylist.add("xupan");
        mylist.add("xumouren");
        System.out.println(judge(s, mylist));
    }

    /**
     * dp[i]判断在目标字符串列表中是否有以s[i]结尾的字符串
     * @param s
     * @param wordDict
     * @return
     */
    static List<String> wordBreak(String s, List<String> wordDict){

        return null;
    }

    static boolean judge(String s, List<String> wordDict){
        //判断一个单词是否在字符串列表中
        if(wordDict.contains(s))
            return true;
        else
            return false;
    }
}

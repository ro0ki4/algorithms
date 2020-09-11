package pan.xu.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串s可以被拆分为字符串列表中的字符串
 */
public class 单词拆分 {
    static int flag = 0;
    static int num = 0;
    static int numFlag = 0;
    static String string = "";
    static List<Integer> integerList = new ArrayList<>();
    static List<String> mylist1 = new ArrayList<>();
    public static void main(String[] args) {
        String s = "xupanhen";
        string = s;
        List<String> mylist = new ArrayList<>();
        mylist.add("xupan");
        mylist.add("hen");
        mylist.add("xupa");
        mylist.add("nhen");
        mylist.add("xup");
        mylist.add("anhen");
        mylist.add("xupanh");
        mylist.add("hen");
        mylist.add("an");

        System.out.println(wordBreak(s, mylist));
        //System.out.println(s.substring(8));
        System.out.println(solution2(s, mylist));
        //System.out.println(solution3(s, mylist));
//        for(String str: mylist1){
//            System.out.print(str + "--");
//        }
        System.out.println(num);
    }

    /**
     * dp[i]标识字符串前i个是否可以被拆分为字符串列表中的字符串
     * dp[i] = (dp[i-k1]&&wordDict.contains(s.substring(k1))||(dp[i-k2]&&wordDict.contains(s.substring(k2))||....
     * @param s
     * @param wordDict
     * @return
     */

    /**
     * 问题：
     * 现在有一个字符串 s 和一个字符串集合List<String> wordDict
     * 试着找出所有 s 可以分割为字符串集合中的字符串的集合
     * @param s
     * @param wordDict
     * @return
     */
    static boolean wordBreak(String s, List<String> wordDict){
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<=i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    static boolean solution2(String s, List<String> wordDict){
//        if(s.length()==1)
//            return wordDict.contains(s);
        if(s.length()<1) {
            num++;
            //show(integerList);
            for(int i : integerList){
                System.out.print(i + "   ");
            }
            System.out.println();
            return false;
        }
        for(int i=0;i<s.length();i++){
//            if(wordDict.contains(s.substring(0,i+1))&&solution2(s.substring(i+1),wordDict)){
//                mylist1.add(s.substring(0, i + 1));
//                //下面这个返回值是两个不同的值是寻找一条路径和所有路径的关键
//                return true;
//            }
            if(wordDict.contains(s.substring(0,i+1))){
                integerList.add(i);
                numFlag++;
                if(solution2(s.substring(i+1),wordDict)){
                    return true;
                } else{
                    //回溯
                    numFlag--;
                    integerList.remove(numFlag);
                }
            }
        }
        return false;
    }

    static boolean solution3(String s, List<String> wordDict){
        System.out.println(flag++);
        if(s.length()==1)
            return wordDict.contains(s);
        if(s.length()<1)
            return true;
        for(int i=0;i<s.length();i++){
            if(solution3(s.substring(0,i+1),wordDict)&&solution3(s.substring(i+1),wordDict)){
                return true;
            }
        }
        return false;
    }

}

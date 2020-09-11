package pan.xu.贪心算法;

public class 去除重复的字母 {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(remove(s));
        System.out.println(removeDuplicateLetters(s));
        System.out.println(solution(s));

    }

    static String remove(String s){
        if(s.length()<=1)
            return s;
        int[] flag = new int[26];
        char[] letter = s.toCharArray();
        //标识字母的数量
        for(char l: letter){
            flag[l-'a']++;
        }
        int local = 0;
        for(int i=0;i<s.length();i++){
            //寻找最小的字典序的位置，即寻找最小字母的第一个位置
            if(s.charAt(i)<s.charAt(local))
                local = i;
            //退出的条件，即一个出现过的字母已经在之前全部出现了，后面已经没有了
            //此时的local就是最小字典序的最小字母的位置
            /**
             * 这里是关键
             */
            if(--flag[s.charAt(i)-'a']<=0)
                break;
        }
        //此方法就是寻找出最小字典序的最小字母
        //因此我们使用递归来一个一个寻找出每个字母
        //将之前出现的最小字母从递归的参数中去掉
        return s.charAt(local) + remove(s.substring(local + 1).replace("" + s.charAt(local), ""));
    }


    static String solution(String s){
        int[] flag = new int[26];
        char[] letter = s.toCharArray();
        for(char l : letter){
            flag[l-'a']++;
        }
        int num = 0;
        for(int number : flag){
            if(number!=0)
                num++;
        }

        String str = "";

        for(int i=0; i< num;i++){
            int local = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(local)>s.charAt(j)){
                    local = j;
                }
                if(--flag[s.charAt(j)-'a']<=0)
                    break;
            }
            str = str + s.charAt(local);
            s = s.substring(local + 1).replace(s.charAt(local) + "", "");
        }
        return str;
    }

    static String removeDuplicateLetters(String s) {
        if (s == null || s.length() <= 1) return s;

        int[] map = new int[26];
        char[] strArr = s.toCharArray();

        for (char c : strArr) {
            map[c - 'a']++;
        }

        int minPos = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(minPos)) minPos = i; //找到字典序更小的就更新
            //如果都用完了某个字母，则这个就是当前最小的开头
            if (--map[s.charAt(i) - 'a'] == 0) break;
        }

        //递归进行，需要把这个已经列入结果的字母去掉
        return s.charAt(minPos) + removeDuplicateLetters(
                s.substring(minPos+1).replace(
                        "" + s.charAt(minPos),
                        ""
                ));
    }

}

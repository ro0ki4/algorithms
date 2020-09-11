package pan.面试题.字节跳动;

import java.util.*;

/**
 * @author ro0ki4
 * @data 2020/8/9 9:41
 * version 1.0
 */
public class 聪明的编辑 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(0);
        Integer[] sssss = new Integer[3];
        sssss = set.toArray(sssss);
        Arrays.sort(sssss);
        for(int i : sssss){
            System.out.println(i);
        }

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        //ArrayList<String> tem =  new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            String flag = scan.nextLine();
            String s = tool(flag);
            res.add(s);
        }
        for(String s : res){
            System.out.println(s);
        }

    }
    static String tool(String s){
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count ++;
            }else{
                count = 1;
            }
            if(count >= 3)
                ;
            else{
                res.append(s.charAt(i));
            }
        }
        String tem = res.toString();
        StringBuilder val = new StringBuilder();
        //count = 1;
        boolean flag = true;
        if(tem.length() <=3){
            return tem;
        }else{
            val.append(tem.charAt(0));
            val.append(tem.charAt(1));
            val.append(tem.charAt(2));
            //System.out.println("字符串 "+tem);
            for(int i = 3; i < tem.length(); i++){
                if(tem.charAt(i-3)==tem.charAt(i-2) && tem.charAt(i-1)==tem.charAt(i) && flag){
                    ;
                }else{
                    if(val.charAt(val.length()-1) == val.charAt(val.length()-2))
                        flag = true;
                    else
                        flag = false;
                    val.append(tem.charAt(i));
                }
            }
            return val.toString();
        }

    }
}

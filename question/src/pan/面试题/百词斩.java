package pan.面试题;

import java.util.ArrayList;

/**
 * @author ro0ki4
 * @data 2020/8/12 0:19
 * version 1.0
 */
public class 百词斩 {
    static int res  = 0;
    public static void main(String[] args) {

        System.out.println(10/Math.pow(10,0) >= 10);
        dfs(12258,5);
        System.out.println(res);
    }

    public static void dfs(int num,int len){
        if(len <= 1){
            res++;
            return;
        }
        //one
        dfs((int)(num%Math.pow(10,len-1)),len-1);
        //two
        if(len >= 2 && (int)(num/Math.pow(10,len-2)) <= 25){
            dfs((int)(num%Math.pow(10,len-2)), len-2);
        }
    }

    static void one(int num){
        if(num == 2)
            System.out.println(true);
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0){
                System.out.println(true);
                break;
            }
        }
        System.out.println(false);
    }

    static void two(String s){
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;
        for(int k = 1; k < s.length(); k++){
            if(Integer.parseInt(s.charAt(k)+"") == Integer.parseInt(s.charAt(k-1)+"")+1){
                j++;
                if(k == s.length()-1){
                    if(j - i >= 3){
                        res.append(s.charAt(i)+"-"+s.charAt(j));
                    }else{
                        res.append(s.substring(i,j+1));
                    }
                }
            }else{
                if(j - i >= 3){
                    res.append(s.charAt(i)+"-"+s.charAt(j));
                }else{
                    res.append(s.substring(i,j+1));
                }
                i = k;
                j = k;
            }
        }
        if(res.length() == 0){
            System.out.println(s.charAt(0)+"-"+s.charAt(s.length()-1));
        }
        System.out.println(res.toString());
    }

    static String three(String a,String b){
        int len1 = a.length();
        int len2 = b.length();
        int i = 0;
        int jin = 0;
        StringBuilder res = new StringBuilder();
        while(i <= Math.max(len1,len2)){
            i++;
            //int jin = 0;
            int ben = 0;
            int a1 = len1-i >= 0 ? a.charAt(len1-i)-97 : 0;
            int a2 = len2-i >=0 ? b.charAt(len2-i)-97 : 0;
            int mid = a1+a2+jin;
            jin = mid/26;
            ben = mid%26;
            res.append((char)(ben+97));
        }
        //res.append()
        System.out.println(res);
        String dd = res.reverse().toString();
        if(dd.charAt(0) == 'a')
            return dd.substring(1);
        return res.toString();
    }
}

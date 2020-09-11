package pan.面试题.阿里巴巴;

import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/7/31 14:09
 * version 1.0
 */
public class 序列和 {
    public static void main(String[] args) throws Exception{

        System.out.println(addStrings("1234","123"));


        Class dd = a.class;
        Class ee = Class.forName("pan.面试题.阿里巴巴.a");
        Class ff = new a().getClass();
        new 序列和().ss(dd);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        for(int i = l; i <= 100; i++){
            //(2*n-i*(i-1))%(2*i) == 0
//            System.out.println((float)(2*n-i*(i-1)));
//            System.out.println(2 * n - i*(i - 1));
//            System.out.println((float)(2 * n - i*(i - 1)));
//            System.out.println((float)(2 * i));
//            float b = ((float)(2*n-i*(i-1)))/(float)(2*i);
            if((2*n-i*(i-1))%(2*i) == 0){
                int c = (2*n-i*(i-1))/(2*i);
                for(int j = c; j < c+i-1; j++){
                    System.out.print(j+" ");
                }
                System.out.print(c+i-1);
                return;
            }
        }//1087581626
        System.out.print("No");
        return;

    }

    public void ss(Class<a> b) throws Exception{
        b.newInstance().show("wwwwww");
    }

    public static String addStrings(String num1, String num2) {
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        int len1 = ch1.length;
        int len2 = ch2.length;
        int len = len1 > len2 ? len1+1 : len2+1;
        char[] res = new char[len];
        int regis = 0;
        int index1 = 0;
        int index2 = 0;
        for(int i = 1; i < len; i++){
            if(len1-i >= 0){
                index1 = ch1[len1-i]-48;
            }else{
                index1 = 0;
            }
            if(len2-i >=0){
                index2 = ch2[len2-i]-48;
            }else{
                index2 = 0;
            }
            res[len-i] = ((regis+index1+index2)%10+"").charAt(0);
            regis = (regis+index1+index2)/10;
        }
        res[0] = (regis+"").charAt(0);
        String resu = new String(res);
        if(regis == 0){
            return resu.substring(1);
        }
        return resu;
    }


}

class a{
    public static void show(String s){
        System.out.println(s);
    }
}
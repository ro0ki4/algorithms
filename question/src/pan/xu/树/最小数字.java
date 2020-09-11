package pan.xu.树;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.util.HashMap;

public class 最小数字 {
    public static void main(String[] args) {
        String val = "4321";
        System.out.println(solu(val, 4));

        HashMap<Integer,Integer> hh = new HashMap<>();
        hh.get(1);
    }

    public static String solu(String num, int k){
        int len = num.length();
        for(int i = 0; i < len; i++){
            String val = num.substring(i);
            for(char c = '0'; c <= '9'; c++){
                int index = val.indexOf(c);
                if(index >= 0){
                    if(index == 0)
                        break;
                    if(k>=index){
                        num = num.substring(0,i)+c+num.substring(i,index+i)+num.substring(index+i+1);
                        k -= index;
                        break;
                    }
                }else{
                    if (k == 0)
                        return num;
                }
            }
            if(k == 0)
                return num;
        }
        return num;
    }


}


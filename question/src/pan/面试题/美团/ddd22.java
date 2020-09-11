package pan.面试题.美团;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/15 16:05
 * version 1.0
 */
public class ddd22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            ArrayList<Integer> res = new ArrayList<>();
            int n = scan.nextInt();
            for(int i = 1; i < n+1; i++){
                int val = tool(i,n);
                if(val > 0) {
                    res.add(i);
                    res.add(val);
                }
            }
            int size = res.size();
            if(size == 0)
                System.out.print(0);
            else{
                System.out.println(size);
                for(int i = 0; i < size-1; i++){
                    System.out.println(res.get(i));
                }
                System.out.print(res.get(size-1));
            }

    }
    public static int tool(int i,int len){
        StringBuilder s = new StringBuilder(i + "");
        s.reverse();
        int val = Integer.parseInt(s.toString());
        if(val > len)
            return -1;
        if(val == i*4)
            return val;
        else
            return -1;
    }
}

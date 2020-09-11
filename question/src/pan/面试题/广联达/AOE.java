package pan.面试题.广联达;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ro0ki4
 * @data 2020/7/22 15:40
 * version 1.0
 */

public class AOE {



    public static void main(String[] args) {
        ArrayList<String> aaa = new ArrayList<>();
        aaa.add("a");
        aaa.add("a");
        aaa.add("b");
        for(String i : aaa){
            System.out.println(i);
        }
        aaa.remove(1);
        
        for(String i : aaa){
            System.out.println(i);
        }
        AA h = new AA();
        AA hh = new AA();
        System.out.println(h.b == hh.b);

        ArrayList<Integer> ww = new ArrayList<>();

        boolean aa = true;
        //贪心
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = scan.nextInt();
            int y = scan.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                map.put(scan.nextInt(),scan.nextInt());
            }

            int res = 0;
            while(map.size() > 0) {
                res++;
                int min = Integer.MAX_VALUE-10;
                int max = -1;
                for(int key:map.keySet()){
                    min = Math.min(min, map.get(key));
                    max = Math.max(max, map.get(key));
                }
                int index = min;
                int sum = 0;
                for (int i = min; i <= max; i++) {
                    int sum1 = 0;
                    for (int j = i; j <= i + 2 * y; j++) {
                        if (map.keySet().contains(j)) {
                            sum1++;
                        }
                    }
                    if (sum < sum1) {
                        sum = sum1;
                        index = i;
                    }
                }
                for (int i = index; i <= index + 2 * y; i++) {
                    if (map.keySet().contains(i)) {
                        map.put(i, map.getOrDefault(i, 0) - 1);
                        if (map.get(i) <= 0) map.remove(i);
                    }
                }
            }
            System.out.print(res);
        }
    }
}
class AA{
    ArrayList b;
    int val;
    public AA(int val){
        this.val = val;
    }
    public AA(){};
}
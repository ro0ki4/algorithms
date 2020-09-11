package pan.面试题.广联达;

import java.util.*;

/**
 * @author ro0ki4
 * @data 2020/7/21 20:22
 * version 1.0
 */
public class 输入格式 {
    public static void main(String[] args) {

        String ss = new String("jjj");


        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] kinds = new int[n];
            for(int i = 0; i < n; i++){
                kinds[i] = scan.nextInt();
            }
            HashMap<String,Integer> map = new HashMap<>();
            scan.nextLine();
            for(int i = 0; i < m; i++){
                String s = scan.nextLine();
                map.put(s,map.getOrDefault(s,0)+1);
            }
            int[] buy = new int[map.size()];
            Collection<Integer> values = map.values();
            Object[] objects = values.toArray();
            for(int i = 0; i < buy.length; i++){
                buy[i] = (int)objects[i];
            }
            Arrays.sort(buy);
            Arrays.sort(kinds);
            int min = 0;
            int max = 0;
            for(int i = 0; i < buy.length; i++){
                min += kinds[i]*buy[buy.length-1-i];
            }
            for(int i = 0; i < buy.length; i++){
                max += kinds[n-1-i]*buy[buy.length-1-i];
            }
            System.out.println(min+" "+max);
        }


    }


}

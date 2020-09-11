package pan.面试题.广联达;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/7/22 15:10
 * version 1.0
 */
public class 平行四边形 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = scan.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                int local = scan.nextInt();
                map.put(local,map.getOrDefault(local,0)+1);
            }
            HashMap<Integer,Integer> map2 = new HashMap<>();
            for(int key:map.keySet()){
                if(map.get(key) >= 2){
                    map2.put(key,map.get(key));
                }
            }
            Object[] objects = map2.keySet().toArray();

            int[] keys = new int[objects.length];
            for(int i = 0; i < objects.length; i++){
                keys[i] = (int)objects[i];
            }
            Arrays.sort(keys);

            if(keys.length < 2 && keys[0] < 4) {
                System.out.print(-1);
                continue;
            }

            int sum = 1;
            int index = 0;
            for(int i = keys.length-1; i >= 0; i--){
                if(map2.get(keys[i])>=4 && index == 0){
                    sum = keys[i] * keys[i];
                    break;
                }else{
                    sum = sum * keys[i];
                    index++;
                }
                if(index >=2){
                    break;
                }
            }
            System.out.print(sum);
        }
    }
}

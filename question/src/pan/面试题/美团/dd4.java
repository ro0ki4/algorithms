package pan.面试题.美团;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/15 17:15
 * version 1.0
 */
public class dd4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        ArrayList<Integer[]> tem = new ArrayList<>();
        HashMap<Integer,Integer> ache = new HashMap<>();
        HashMap<Integer,Integer> bche = new HashMap<>();
        for(int i = 0; i < n; i++){
            Integer[] cur = new Integer[2];
            cur[0] = scan.nextInt();
            ache.put(cur[0],i);
            cur[1] = scan.nextInt();
            bche.put(cur[1],i);
            tem.add(cur);
            //dd.put(i,cur);
        }
        Integer[] aa = ache.keySet().toArray(new Integer[10]);
        Integer[] bb = bche.keySet().toArray(new Integer[10]);
        Arrays.sort(aa);
        Arrays.sort(bb);
        int mon = 0;
        int aindex = 0;
        int bindex = 0;
        while(true){
            if(aindex<a&&bindex<b){
                if(bb[n-bindex-1] > aa[bche.get(bb[n-bindex-1])]){
                    mon += bb[n-bindex-1];
                    bindex++;
                }else{
                    mon += aa[bche.get(bb[n-bindex-1])];
                }
            }else{
                if(aindex >= a && bindex < b){
                    mon += bb[n-bindex-1];
                    bindex++;
                }
                else if(aindex < a && bindex >= b){
                    mon += aa[n-aindex-1];
                    aindex++;
                }else
                    break;
            }
        }
        System.out.print(mon);
    }
}

package pan.面试题.美团;

import java.util.*;

/**
 * @author ro0ki4
 * @data 2020/8/15 16:38
 * version 1.0
 */
public class dd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashMap<Integer, HashSet<Integer>> res = new HashMap<>();
        int index = 0;
        for(int i = 0; i < m; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(index == 0){
                res.put(index,new HashSet<Integer>());
                index++;
            }
            boolean flag = false;
            for(int j = 0; j < index; j++){
                if(res.get(j).contains(a)||res.get(j).contains(b)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                res.put(index, new HashSet<>());
                index++;
            }
            for(int j = 0; j < index; j++){
                if(res.get(j).contains(a)){
                    res.get(j).add(b);
                }
                if(res.get(j).contains(b)){
                    res.get(j).add(a);
                }
            }
        }
        System.out.println(index);
        ArrayList<Integer[]> hh = new ArrayList<>();
        for(int i = 0; i < index; i++){
            Integer[] val = res.get(i).toArray(new Integer[10]);
            Arrays.sort(val);
            hh.add(val);
        }
        ArrayList<Integer[]> dd = new ArrayList<>();
        while(hh.size() > 0){
            int cur = hh.get(0)[0];
            for(int i = 0; i < hh.size(); i++){
                if(hh.get(i)[0] < cur){
                    cur = hh.get(i)[0];
                }
            }
            dd.add(hh.get(cur));
            hh.remove(cur);
        }
        for(int i = 0; i < hh.size(); i++){
            for(int j : hh.get(i)){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

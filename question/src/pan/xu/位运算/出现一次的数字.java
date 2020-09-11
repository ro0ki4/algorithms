package pan.xu.位运算;

import java.util.*;

public class 出现一次的数字 {
    public static void main(String[] args) {

        Map<Integer,Set<Integer>> map = new HashMap<>();
        HashSet<Integer> dddd = new HashSet<>();
        dddd.add(3);
        map.put(1,new HashSet<Integer>());
        map.put(1,map.getOrDefault(1,new HashSet<Integer>()));
        Set<Integer> hh = new HashSet<>();





        int[] aa = {2,2,2,1,1,1,4,4,4,5,6,6,6};
//        System.out.println(solution(aa));
//        for(int i : aa){
//            if(i == 4)
//                break;
//            System.out.println(i);
//        }
//        HashMap<String,String> hhhh = new HashMap<>();
        ArrayList<Integer> bb = new ArrayList();
        bb.add(1);
        bb.add(2);
        bb.add(3);
        for(int i = 0; i < bb.size();){
            System.out.println(bb.size());
            System.out.println(bb.get(i));
            if(bb.get(i) == 1) {
                bb.remove(i);
                continue;
            }
            i++;
        }

    }


    static int solution(int[] nums){
        int res = 0;
        for(int i = 0; i < 32; i++){
            int mask = 1<<i;
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if((nums[j]&mask) != 0){
                    count++;
                }
            }
            if(count%3 != 0){
                res = res|mask;
            }
        }
        return res;
    }
}

package pan.xu.广度优先;

import java.lang.reflect.Array;
import java.util.*;

public class 网络延迟时间 {
    public static void main(String[] args) {
        int[][] times = {{2,1,2},{2,3,1},{3,4,1}};
        int[] t = {1,2,1};

//        System.out.println(networkDelayTime(t,2,2));
        HashSet<Integer> a =new HashSet();
        a.add(2);
        a.add(1);
        a.remove(0);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(1);
        b.remove((Object)2);
        for(int i:b){

            System.out.println(i);

        }
    }

    public static int networkDelayTime(int[][] times, int N, int K) {
        int[] res = new int[N];
        Set<Integer> a = new LinkedHashSet();
        Set<Integer> b = new LinkedHashSet();
        for(int i = 1; i < N+1; i++){
            b.add(i);
        }
        a.add(K);
        b.remove(K);
        while(b.size()>0){
            int aa = -1;
            int bb = Integer.MAX_VALUE-1;
            //int c = 0;
            for(int i = 0; i < times.length; i++){
                for(int ii:a){
                    if(ii == times[i][0]&&b.contains(times[i][1])){
                        if(bb > (times[i][2]+res[times[i][0]-1])){
                            bb = times[i][2]+res[times[i][0]-1];
                            res[times[i][1]-1] = bb;
                            aa = i;
                            //c = 1;
                        }
                    }
//                    if(ii == times[i][1]&&b.contains(times[i][0])){
//                        if(bb > (times[i][2]+res[times[i][1]-1])){
//                            bb = times[i][2]+res[times[i][1]-1];
//                            res[times[i][1]-1] = bb;
//                            aa = i;
//                            c = 0;
//                        }
//                    }
                }
            }
            if(aa == -1)
                return -1;
            a.add(times[aa][1]);
            b.remove(times[aa][1]);
        }
        int s = 0;
        for(int ss:res){
            // System.out.println(ss);
            if(s<ss)
                s = ss;
        }
        return s;

    }
}

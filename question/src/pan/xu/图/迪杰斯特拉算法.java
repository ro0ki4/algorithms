package pan.xu.图;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class 迪杰斯特拉算法 {
    public static void main(String[] args) {
        int[][] aa = {{1,2},{1,3},{1,4},{2,4},{3,4}};
        double[] biase = {0.8,0.9,0.3,0.8,0.7};
        double[] res = new double[4];

        Queue<Integer> que = new LinkedList<>();
        que.offer(1);


    }
    static void  djstl(int[][] graph,int start,int end,double[] res,double[][] biase,int n){
        Set<Integer> used = new HashSet<>();
        used.add(start);
        res[start] = 1;
        int times = 0;
        boolean flag = false;
        while(times < n){
            for(int i = 0; i < n; i++){
                if(!used.contains(i)){
                    //寻找新的一个节点加入
                    int[] tem = graph[i];
                    int max = 0;
                    int index = -1;
                    for(int j = 0; j < tem.length; j++){
                        if(tem[j] != 0 && used.contains(j)){
                            if(tem[j] > max) {
                                index = j;
                                res[i] = res[j]*biase[i][j];
                            }
                        }
                    }
                    if(index != -1){
                        used.add(i);
                        if(i == end)
                            flag = true;
                    }
                }
            }
            if(flag)
                break;
        }
    }
}

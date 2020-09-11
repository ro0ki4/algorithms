package pan.xu.图;

import java.util.ArrayList;

/**
 * @author ro0ki4
 * @data 2020/8/4 16:56
 * version 1.0
 */
public class 寻找最长路径 {

    static boolean[] visited = new boolean[7];
    public static void main(String[] args) {
        int[][] gra = new int[][]{{1, 0}, {4, 0}, {2,3}, {5, 4}, {6, 5}, {3, 6}};
        ArrayList<Integer>[] g = new ArrayList[7];
        for(int i = 0; i < 7; i++){
            g[i] = new ArrayList<>();
        }
        for(int[] t : gra){
            g[t[1]].add(t[0]);
        }
        寻找最长路径 aa = new 寻找最长路径();
        System.out.println(aa.dfs(g,0,1,visited));
    }

    public int dfs(ArrayList<Integer>[] gra,int index,int sum,boolean[] visited){
        if(visited[index])
            return sum-1;

        if(gra[index].size() <= 0){
            return sum;
        }
        visited[index] = true;
        int max = 0;
        for(int i : gra[index]){
            max = Math.max(max, dfs(gra, i, sum + 1, visited));
        }
        visited[index] = false;
        return max;
    }

}

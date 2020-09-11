package pan.xu.图;

import java.util.LinkedList;
import java.util.Queue;

public class 判断二分图 {
    public static void main(String[] args) {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        System.out.println(solu(graph));
    }

    static boolean solu(int[][] graph){
        int len = graph.length;
        int[] visited = new int[len];
        for(int i = 0; i < len; i++){
            if(visited[i] != 0)
                continue;
            visited[i] = 1;
            Queue<Integer> que = new LinkedList();
            que.add(i);
            while(que.size() > 0){
                Integer cur = que.poll();
                int[] curl = graph[cur];
                int color = -1 * visited[cur];
                for(int j = 0; j < curl.length; j++){
                    if(visited[curl[j]] == 0){
                        visited[curl[j]] = color;
                        que.add(curl[j]);
                        continue;
                    }
                    else{
                        if(visited[curl[j]] != color)
                            return false;
                    }
                }
            }
        }
        return true;
    }
}

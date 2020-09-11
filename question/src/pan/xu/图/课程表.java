package pan.xu.图;

import java.util.ArrayList;

/**
 * @author ro0ki4
 * @data 2020/8/4 14:31
 * version 1.0
 */
public class 课程表 {
    public static void main(String[] args) {
        int[][] gra = new int[][]{{0,1},{1,0}};
        System.out.println(canFinish(2, gra));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] gra = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++){
            gra[i] = new ArrayList();
        }
        for(int[] cur : prerequisites){
            gra[cur[1]].add(cur[0]);
        }
        for(int i = 0; i < numCourses; i++){
            if(dfs(i,gra,1) >= numCourses){
                return true;
            }
        }
        return false;
    }

    public static int dfs(int cur,ArrayList<Integer>[] gra,int num){
        if(gra[cur].size() <= 0)
            return num;
        int max = 0;
        for(int i : gra[cur]){
            int index = gra[i].indexOf(cur);
            gra[i].remove((Object)cur);
            max = Math.max(max,dfs(i,gra,num+1));
            gra[i].add(index,cur);
        }
        return max;
    }
}

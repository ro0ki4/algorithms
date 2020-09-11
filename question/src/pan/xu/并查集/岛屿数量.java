package pan.xu.并查集;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ro0ki4
 * @data 2020/9/8 16:46
 * version 1.0
 */
public class 岛屿数量 {

    static int[] parent = null;
    public static void main(String[] args) {
        ArrayList<Integer> hh = new ArrayList<>();
        hh.clear();
    }
    public static void solu(char[][] grid){
        int len1 = grid.length;
        int len2 = grid[0].length;
        parent = new int[len1*len2];
        //init parent
        for(int i = 0; i < len1*len2; i++){
            parent[i] = i;
        }
        //union

        for(int i = 0; i < len2-1; i++){
            if(grid[0][i] == '1' && grid[0][i+1] == 1){
                union(parent,i,i+1);
            }
        }
        for(int i = 0; i < len1-1; i++){
            if(grid[i][len2-1] == '1' && grid[i+1][len2-1] == '1'){
                union(parent,i*len2+len2-1,i*len2+2*len2-1);
            }
        }

        for(int i = 1; i < len1; i++){
            for(int j = 0; j < len2-1; j++){
                if(grid[i-1][j]=='1'&&grid[i][j] == '1'){
                    union(parent,(i-1)*len2+j,i*len2+j);
                }
                if(grid[i][j] == '1' && grid[i][j+1] == '1'){
                    union(parent,i*len2+j,i*len2+j+1);
                }
            }
        }



    }

    private static int find(int[] parent, int i){
        while(parent[i] != i){
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }

    private static void union(int[] parent, int i, int j){
        int val1 = find(parent,i);
        int val2 = find(parent,j);
        if(val1 != val2){
            parent[val1] = val2;
        }
    }
}

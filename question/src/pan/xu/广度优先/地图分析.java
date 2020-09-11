package pan.xu.广度优先;

import java.util.LinkedList;
import java.util.Queue;

public class 地图分析 {
    public static void main(String[] args) {
        int[][] grid = {{1,0,0},{0,0,0},{0,0,0}};
        System.out.println(maxDistance(grid));
    }

    public static int maxDistance(int[][] grid) {
        int num = grid[0][0];
        boolean flag = true;
        Queue<int[][]> que = new LinkedList();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(num != grid[i][j])
                    flag = false;
                if(grid[i][j] == 1){
                    que.add(new int[i+1][j+1]);
                }
            }
        }
        if(flag)
            return -1;

        Queue<Queue<int[][]>> first = new LinkedList();
        first.add(que);
        int len = grid.length;
        int lie = grid[0].length;
        int sum = 0;
        while(first.size() > 0){
            Queue<int[][]> second = first.poll();
            Queue<int[][]> third = new LinkedList();
            while(second.size() > 0){
                int[][] index = second.poll();
                int line = index.length;
                int column = index[0].length;
                if( line-1-1>=0 &&grid[line-2][column-1]==0){
                    grid[line-2][column-1] = 1;
                    third.add(new int[line-1][column]);
                }
                if(line-1+1<=len-1&&grid[line][column-1]==0){
                    grid[line][column-1] = 1;
                    third.add(new int[line+1][column]);
                }
                if(column-1-1>=0&&grid[line-1][column-2]==0){
                    grid[line-1][column-2] = 1;
                    third.add(new int[line][column-1]);
                }
                if(column-1+1<=lie-1&&grid[line-1][column]==0){
                    grid[line-1][column] = 1;
                    third.add(new int[line][column+1]);
                }
            }

            if(third.size() > 0) {
                first.add(third);
                sum++;
            }
        }
        return sum;
    }
}

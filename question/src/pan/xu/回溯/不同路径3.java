package pan.xu.回溯;

public class 不同路径3 {

    static int num = 0;
    static int sum = 0;
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(uniquePath3(grid));
        System.out.println(sum);
    }

    /**
     * 题目：
     * 在二维网格 grid 上，有 4 种类型的方格：
     *
     * 1 表示起始方格。且只有一个起始方格。
     * 2 表示结束方格，且只有一个结束方格。
     * 0 表示我们可以走过的空方格。
     * -1 表示我们无法跨越的障碍。
     * 返回在四个方向（上、下、左、右）上行走时，从起始方格到结束方格的不同路径的数目，每一个无障碍方格都要通过一次。
     *
     * @param grid
     * @return
     */
    static int uniquePath3(int[][] grid){
        if(grid.length<1)
            return 0;
        for(int i = 0;i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    find(grid, i, j);
                }
            }
        }
        return num;
    }

    static boolean find(int[][] grid,int i,int j){
        //目标矩阵，位置坐标


        if (i > grid.length - 1 || i < 0 || j > grid[i].length - 1  || j < 0) {
            return false;
        }
        sum++;
        if(grid[i][j]!=0&&grid[i][j]!=1&&grid[i][j]!=2){
            return false;
        }

        //到达终点

        if(grid[i][j]==2){
            //满足走过所有的无障碍方格
            if(judge(grid)) {
                num++;
                show(grid);
                return false;
            }
            else
                return false;
        }

        grid[i][j] = -1;
        if(find(grid,i+1,j)||find(grid,i,j+1)||find(grid,i-1,j)||find(grid,i,j-1)){
            return true;//返回值不重要
        }
        //回溯
        grid[i][j] = 0;
        return false;

    }

    static boolean judge(int[][] grid){
        //判断是否走过所有的无障碍方格
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0)
                    return false;
            }
        }
        return true;
    }

    static void show(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j]<0){
                    System.out.print(" "+grid[i][j] + "  ");
                }
                else
                    System.out.print("  "+grid[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

}

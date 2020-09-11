package pan.xu.深度优先;

/**
 * @author ro0ki4
 * @data 2020/7/28 21:54
 * version 1.0
 */
public class 最长递增路径 {
    public static void main(String[] args) {
        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        int[] res = new int[1];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                dfs(matrix,i,j,res,0);
            }
        }
        System.out.println(res[0]);
    }

    public static void dfs(int[][] matrix, int i, int j, int[] res, int level){
        // if(i<0||i>=matrix.length||j<0||j>=matrix[0].length){
        //     res[0] = Math.max(res[0],level);
        //     return;
        // }
        if(i+1 < matrix.length &&matrix[i+1][j] > matrix[i][j]) {
            System.out.println("1");
            dfs(matrix, i + 1, j, res, level + 1);
        }
        else{
            res[0] = Math.max(res[0],level+1);
            //return;
        }
        if(i-1 >= 0 && matrix[i-1][j] > matrix[i][j]) {
            System.out.println("2");
            dfs(matrix, i - 1, j, res, level + 1);
        }
        else{
            res[0] = Math.max(res[0],level+1);
            //return;
        }
        if(j+1 < matrix[0].length && matrix[i][j+1] > matrix[i][j]) {
            System.out.println("3");
            dfs(matrix, i, j + 1, res, level + 1);
        }
        else{
            res[0] = Math.max(res[0],level+1);
            //return;
        }
        if(j-1 >= 0 && matrix[i][j-1] > matrix[i][j]) {
            System.out.println("4");
            dfs(matrix, i, j - 1, res, level + 1);
        }
        else{
            res[0] = Math.max(res[0],level+1);
            //return;
        }
        return;
    }
}

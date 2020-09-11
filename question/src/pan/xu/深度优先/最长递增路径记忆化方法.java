package pan.xu.深度优先;

/**
 * @author ro0ki4
 * @data 2020/7/29 18:51
 * version 1.0
 * 使用记忆化的方法解决深度优先出现的重复路径，降低复杂度
 */
public class 最长递增路径记忆化方法 {

    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public static void main(String[] args) {

        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int[][] tem = new int[len1][len2];
        int res = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                res = Math.max(res,dfs(matrix,i,j,tem));
            }
        }
        System.out.println("result:"+res);

    }

    /**
     * 如果tem[i][j]!= 0 说明这个位置已经被走过，并且值为路径长度
     * @param matrix
     * @param i
     * @param j
     * @param tem
     * @return
     */
    public static int dfs(int[][] matrix,int i,int j,int[][] tem){
        if(tem[i][j] != 0)
            return tem[i][j];
        tem[i][j] = 1;
        //四个方向的深度优先遍历
        for(int[] dire : dir){
            //判断ij是否合法
            if(i+dire[0]>=0&&i+dire[0]<tem.length&&j+dire[1]>=0&&j+dire[1]<tem[0].length&&matrix[i+dire[0]][j+dire[1]]>matrix[i][j]){
                tem[i][j] = dfs(matrix,i+dire[0],j+dire[1],tem)+1;
            }
        }
        return tem[i][j];
    }
}

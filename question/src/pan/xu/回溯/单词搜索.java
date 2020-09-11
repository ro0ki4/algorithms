package pan.xu.回溯;

public class 单词搜索 {
    //声明一个判断它们是否走过的矩阵
    public static boolean[][] flag;


    public static boolean exist(char[][] board, String word){
        //初始化标记矩阵，false为没走过
        flag = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&find(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }


    public static boolean find(char[][] board,String word,int i,int j,int num){
        //分别代表目标矩阵
        //目标字符串，矩阵中元素的坐标，字符串的字符坐标
        if(num==word.length())
                   return true;
        //如果坐标已经超出界限，返回false
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||board[i][j]!=word.charAt(num)||flag[i][j])
            return false;

        //标记矩阵坐标i，j已经被走过
        flag[i][j]=true;
        //如果返回的是false，那么就回溯
        if(find(board,word,i+1,j,num+1)||find(board,word,i-1,j,num+1)||
                find(board,word,i,j+1,num+1)||find(board,word,i,j-1,num+1))
            return true;
        //回溯
        flag[i][j]=false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCSEED";
        System.out.println(exist(board, word));

    }
}


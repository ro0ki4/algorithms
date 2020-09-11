package pan.xu.杂七杂八;

import java.util.HashSet;
import java.util.LinkedList;

public class 有序矩阵中第K小的元素 {
    public static void main(String[] args) {
        String s = "0100231120243120334545501421533";
        int[][] matrix = {{1, 5}, {6, 8}};
        System.out.println(solution(matrix, 3));

        HashSet<Integer> aa = new HashSet<>();
        LinkedList<Integer> bb = new LinkedList<>();

    }

    static int solution(int[][] matrix,int k){
        int len = matrix.length;
        int[] index = new int[len];
        int minindex = 0;
        for(int j = 0; j < k; j++){
            for(int i = 0; i < len; i++){
                if(index[i] >= len) {
                    if(index[i] == len){
                        index[i]++;
                        minindex++;
                    }

                    continue;
                }
                if(matrix[i][index[i]] < matrix[minindex][index[minindex]])
                    minindex = i;
            }
            System.out.println(minindex);
            if(j == k-1)
                return matrix[minindex][index[minindex]];
            index[minindex]++;
        }
        return -1;
    }
}

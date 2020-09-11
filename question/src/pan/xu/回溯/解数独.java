package pan.xu.回溯;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class 解数独 {
    public static void main(String[] args) {

    }
}

class Solution{
    public void solveSuDuKu(char[][] board){

    }

    public boolean realsolve(char[] board,int i){
        List value = getNum(board);
        return true;
    }

    public List<Character> getNum(char[] line){
        //char[] value = new char[10];
        List<Character> value = new ArrayList<>();
        int h = 0;
        for(int i = 1; i < 10; i++){
            int flag = 0;
            for(int j = 0; j < 9; j++){
                if((i+"").equals(line[j])){
                    flag = 1;
                    break;
                }
            }
            if(flag != 0)
                //value[h++] = (i+"").toCharArray()[0];
                value.add((i+"").toCharArray()[0]);
        }
        return value;
    }
}

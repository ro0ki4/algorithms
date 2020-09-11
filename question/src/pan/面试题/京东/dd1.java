package pan.面试题.京东;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/27
 * version 1.0
 */
public class dd1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> tem = new ArrayList<>();
        int index = 0;
        int i = 1;

        while(index < n){
            i++;
            if(judge(i)){
                index++;
                tem.add(i);
            }
        }
        for(int j = 0; j < tem.size(); j++){
            System.out.print(tem.get(j));
        }


    }
    static boolean judge(int i){
        String s = i+"";
        if(s.contains("0")||s.contains("1")||s.contains("4")||s.contains("6")||s.contains("7")||s.contains("8")||s.contains("9"))
            return false;
        return true;
    }
}

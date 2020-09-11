package pan.面试题.美团;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/15 16:24
 * version 1.0
 */
public class dfadsf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<String[]> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            res.add(scan.nextLine().split(" "));
        }


    }
    public static void dfs(ArrayList<String[]> res,int[] val,String s,int i){
        if(i >= res.size())
            return;
        if(res.get(i)[1].equals(s)){
            val[0]++;
            val[1] = i;
            return;
        }
        for(int j = i+1; j < res.size(); j++){
            if(res.get(j)[0].equals(res.get(i)[1]))
            dfs(res,val,s,j);
        }
    }
}

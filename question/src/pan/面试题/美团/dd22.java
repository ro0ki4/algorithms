package pan.面试题.美团;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ro0ki4
 * @data 2020/8/15 17:08
 * version 1.0
 */
public class dd22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        ArrayList<String[]> tem = new ArrayList<>();
        for(int i = 0; i < n; i++){
            tem.add(scan.nextLine().split(" "));
        }
        int res = 0;
        String tar = tem.get(0)[0];
        for(int i = 0; i < n; i++){
            if(tem.get(i)[1].equals(tar)){
                res++;
                if(i+1 < n)
                    tar = tem.get(i+1)[0];
            }
        }
        System.out.print(res);
    }
}

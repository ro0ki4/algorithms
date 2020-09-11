package pan.xu.杂七杂八;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class My{
    public static void main(String[] args) {

        Deque<Integer> que = new LinkedList<>();
//        Stack<Integer> sta = new Stack<>();
//        sta.push(1);
//        sta.push(2);
        que.push(1);
        que.push(2);
        for(Integer i : que){
            System.out.println(i);
        }
        System.out.println("--------------");
        System.out.println(que.removeFirst());
        //que.pop();

        String ss = new String();
        // Scanner scan = new Scanner(System.in);
        // int line = scan.nextInt();
        // int[][] num = new int[line][line];
        // while(line>0){
        //     String[] s = scan.nextLine().trim().split(" ");
        //     int i = 0;
        //     for(String ss : s){
        //         num[4-line][i] = Integer.parseInt(ss);
        //         i++;
        //     }
        //     line--;
        // }
        // scan.close();

        int[][] num = {{0,2,6,5},{2,0,4,4},{6,4,0,2},{5,4,2,0}};
        System.err.println(hh(num));
    }
    static int hh(int[][] num,String... aa){
        int[] city = new int[num.length-1];
        for(int i = 0; i < city.length; i++){
            city[i] = i+1;
        }

        int moy = 0;

        return moy;
    }
}
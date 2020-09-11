package pan.xu.回溯;

import java.util.Scanner;

public class N皇后问题 {
    static int times=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("几皇后问题");
        int num = scanner.nextInt();
        int[] flag = new int[num];//记录每行皇后的位置
        find( 0,flag,num);
        System.out.println(times);
    }

    public static void find(int low,int[] flag,int num){//行

        if(low>=num){//一个正确的解
            times++;
            show(flag);
            return;
        }

        for(int i=0;i<flag.length;i++){//找到该行的解
            flag[low]=i+1;
            if(!judge(flag)){
                flag[low]=0;
            }
            else{
                find(low + 1, flag, num);
                flag[low]=0;//回溯
            }
        }
    }

    public static boolean judge(int[] flag){//判断该行是否可以放置皇后
        for(int i=0;i<flag.length;i++){
            for(int j=i+1;j<flag.length;j++){
                if(flag[i]==flag[j]&&flag[i]>0)
                    return false;
                if(flag[i]-flag[j]==i-j&&flag[i]>0&&flag[j]>0)
                    return false;
                if(flag[i]-flag[j]==j-i&&flag[i]>0&&flag[j]>0)
                    return false;
            }
        }
        return true;
    }

    public static void show(int[] flag){
        for(int i=0;i<flag.length;i++){
            for(int j=0;j<flag.length;j++){
                if(flag[i]==j+1)
                    System.out.print("Q ");
                else
                    System.out.print("1 ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }
}

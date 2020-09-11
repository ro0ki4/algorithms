package pan.xu.编译原理;

import java.util.ArrayList;
import java.util.List;

public class KMP算法 {
    public static void main(String[] args) {

    }
    public static List<Integer> KMP(List<Integer> target){
        ArrayList<Integer> next = new ArrayList<>();
        next.add(0,0);
        next.add(1,0);
        for(int i = 2; i < target.size(); i++){// i 为最大下标
            for(int j = i/2; j > 0; j--){// j 为尝试次数
                boolean flag = true;
                for(int k = 0; k < j; k++){// k 为判断次数
                    if(target.get(k) != target.get(i-j+k)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    next.add(i,j);
                    break;
                }
            }
        }
        return next;
    }
}

package pan.xu.极小化极大;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ro0ki4
 * @data 2020/9/11 20:36
 * version 1.0
 */
public class 我能赢吗464 {
    public static void main(String[] args) {
        int maxChoosableInteger = 19;
        int desiredTotal = 109;
        List<Integer> tem = new ArrayList();
        for(int i = 1; i <= maxChoosableInteger; i++){
            tem.add(i);
        }

        System.out.println(tool(tem,0,desiredTotal));
    }

    static Map<String,Boolean> map = new HashMap();
    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        List<Integer> tem = new ArrayList();
        for(int i = 1; i <= maxChoosableInteger; i++){
            tem.add(i);
        }
        return tool(tem,0,desiredTotal);

    }


    public static boolean tool(List<Integer> tem, int sum, int desiredTotal){
        if(sum >= desiredTotal){
            map.put(tem.toString(),false);
            return false;
        }
        if(map.keySet().contains(tem.toString())){
            return map.get(tem.toString());
        }
        for(int i = 0; i < tem.size(); i++){
            int cur = tem.get(i);
            tem.remove(i);
            boolean flag = tool(tem,sum+cur,desiredTotal);
            tem.add(i,cur);
            if(!flag){
                map.put(tem.toString(),true);
                return true;
            }
        }
        map.put(tem.toString(),false);
        return false;
    }
}

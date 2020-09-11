package pan.xu.回溯;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 组合总数 {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};

        int target = 8;
        System.out.println(conbinationSum(candidates, target));

    }

    public static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> conbinationSum(int[] candidates,int target){
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();

        find(candidates, list, 0, target, 0);

        return res;
    }

    public static void find(int[] candidates,List<Integer>list,int sum, int target,int index){
        //目标数组事先是排过队的
        //参数分别是目标数组，需要添加的集合，当前的总和，目标数，当前的下标
        if(sum>target){
            return;
        }
        if(sum==target){//一个完整的解
            res.add(list);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            List<Integer> t_list = new ArrayList<>(list);
            t_list.add(candidates[i]);
            find(candidates, t_list, sum + candidates[i], target,i);
        }

    }
}

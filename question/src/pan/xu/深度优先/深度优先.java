package pan.xu.深度优先;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 深度优先 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
//        for(List<Integer> a:result){
//            for(int i : a){
//                System.out.print(i+"   ");
//            }
//            System.out.println();
//        }
        ArrayList<Integer> aa = new ArrayList<>();
        System.out.println(aa.hashCode());
        aa.add(1);
        aa.add(2);
        System.out.println(aa.hashCode()+"=====");
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        ArrayList<Integer> f = new ArrayList();
        HashSet<Integer> z = new HashSet();
        for(int i : nums){
            z.add(i);
        }

        dfs(nums,z,res,f,nums.length,1);
        return res;
    }

    public static void dfs(int[] nums, HashSet<Integer> z, List<List<Integer>> res, List<Integer> f, int len, int level){
        if(level > len){
            res.add(new ArrayList<>(f));
            return;
        }
        for(int i = 0; i < len; i++){
            int j = nums[i];
            if(z.contains(j)){
                z.remove(j);
                f.add(j);
                dfs(nums,z,res,f,len,level+1);
                f.remove((Object)j);
                z.add(j);
            }
        }
    }
}

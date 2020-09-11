package pan.xu.二叉树;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ro0ki4
 * @data 2020/7/21 11:13
 * version 1.0
 */
public class 不同的二叉搜索树2 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static void show(TreeNode root){
        if(root  == null)
            return;
        System.out.print(root.val+"  ");
        show(root.left);
        show(root.right);
    }

    static void test(TreeNode root){
        root.left = new TreeNode(1);
        root = root.left;
        root.left = new TreeNode(3);
    }

    public static void main(String[] args) {
        //List<TreeNode> res = new 不同的二叉搜索树2().generateTrees(3);
//        for(TreeNode s : res){
//            show(s);
//            System.out.println("");
//        }
//        TreeNode root = new TreeNode(2);
//        System.out.println(root.val);
//        test(root);
//        show(root);

    }



//    public List<TreeNode> generateTrees(int n) {
//        List<TreeNode> res = new ArrayList();
//        Set<Integer> set = new HashSet();
//        for(int i = 1; i < n+1; i++){
//            set.add(i);
//        }
//        for(int i = 1; i < n+1; i++){
//            TreeNode root = new TreeNode(i);
//            set.remove(i);
//            dfs(n, root, set, res);
//            set.add(i);
//        }
//
//        return res;
//    }
//    public void dfs(int n, TreeNode root,Set<Integer> set, List<TreeNode> res){
//        if(set.size() <= 0){
//
//            res.add(root);
//            return;
//        }
//
//        else{
//            int index = -1;
//            for(int i = 1; i < n+1; i++){
//                if(set.contains(i)){
//                    index = i;
//                    set.remove(index);
//                    add(root,index);
//                    dfs(n,root,set,res);
//                    del(root,index);
//                    set.add(index);
//                }
//            }
//
//
//        }
//    }
//
//    public void add(TreeNode root,int index){
//        while(root != null){
//            if(root.val > index)
//                if(root.left != null)
//                    root = root.left;
//                else {
//                    root.left = new TreeNode(index);
//                    return;
//                }
//            else
//                if(root.right != null)
//                    root = root.right;
//                else{
//                    root.right = new TreeNode(index);
//                    return;
//                }
//        }
//        root = new TreeNode(index);
//    }
//
//    public void del(TreeNode root,int index){
//        while(root != null){
//            if(root.val > index){
//                if(root.left.val == index) {
//                    root.left = null;
//                    return;
//                }
//                else
//                    root = root.left;
//            }
//            else
//                if(root.val < index){
//                    if(root.right.val == index) {
//                        root.right = null;
//                        return;
//                    }
//                    else
//                        root = root.right;
//                }
//        }
//    }
}






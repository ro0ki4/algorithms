package pan.xu.二叉树;

/*
[
  [3],
  [20,9],
  [15,7]
]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 从上到下打印二叉树 {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(0);
//        root.left = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(4);
//        List<List<Integer>> hehe = solu(root);
//        for(List<Integer> a : hehe){
//            for(Integer b : a){
//                System.out.print(b);
//            }
//            System.out.println();
//        }

        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(0);
        aa.add(0,1);
        for(int bb : aa){
            System.out.println(bb);
        }

    }

    static List<List<Integer>> solu(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<Queue<TreeNode>> first = new LinkedList<>();
        Queue<TreeNode> flag = new LinkedList<>();
        flag.add(root);
        first.add(flag);
        while(first.size() > 0){
            List<Integer> layerres = new ArrayList();
            Queue<TreeNode> second = new LinkedList<>();
            Queue<TreeNode> he = first.poll();
            while(he.size() > 0){
                TreeNode node = he.poll();
                layerres.add(node.val);
                if(node.left != null)
                    second.add(node.left);
                if(node.right != null)
                    second.add(node.right);
            }
            if(second.size() != 0)
                first.add(second);
//            List<Integer> layerres = new ArrayList<>();
//            for(TreeNode a : second){
//                layerres.add(a.val);
//            }
            res.add(layerres);
        }
        return res;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val;}
    }
}





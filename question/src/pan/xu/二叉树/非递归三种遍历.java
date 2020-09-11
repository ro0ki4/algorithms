package pan.xu.二叉树;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ro0ki4
 * @data 2020/8/29 20:20
 * version 1.0
 */
public class 非递归三种遍历 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        preVisited(root);

    }
    public static void preVisited(TreeNode root){
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while(stack.size() > 0){
            TreeNode cur = stack.pop();
            System.out.print(cur.val+"  ");
            if(cur.right != null)
                stack.push(cur.right);
            if(cur.left != null){
                stack.push(cur.left);
            }
        }
    }

    public static void midVisited(TreeNode root){
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        TreeNode node = root;
        while(stack.size() > 0){
            //TreeNode cur = stack.peekLast();
            TreeNode cur = node;
            if(cur.left != null){
//                System.out.println()
                stack.push(cur.left);
            }else{
                System.out.print(cur.val+"  ");
                
            }
        }
    }
}

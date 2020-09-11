package pan.xu.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的序列化和反序列化 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.right = new TreeNode(1);
        String tarstr = serializable(root);
        System.out.println(tarstr);
        TreeNode root1 = deserilizable(tarstr);
        System.out.println(root1.val+" "+root1.left+"  "+root1.right.val+"  "+root1.right.left+"  "+root1.right.right);
    }
    public static String serializable(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null) {
                queue.add(node.left);
                queue.add(node.right);
                list.add(node.val+"");

            }
            else
                list.add("null");
        }
        StringBuilder s = new StringBuilder("[");
        for(String tarstr: list){
            s.append(tarstr + ",");
        }
        s.deleteCharAt(s.length()-1);
        s.append("]");


        return s.toString();
    }

    public static TreeNode deserilizable(String tarstr){
        String[] tarArray = tarstr.substring(1, tarstr.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(tarArray[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        int index = 0;
        queue.add(root);
        while(index < tarArray.length-1){
            TreeNode node = queue.poll();
            if(tarArray[++index].equals("null"))
                ;
            else {
                node.left = new TreeNode(Integer.parseInt(tarArray[index]));
                queue.add(node.left);
            }
            if(tarArray[++index].equals("null"))
                ;
            else {
                node.right = new TreeNode(Integer.parseInt(tarArray[index]));
                queue.add(node.right);
            }
        }
        return root;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(){}
}
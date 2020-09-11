package pan.xu.动态规划;

public class 二叉树中最大路径 {
    public static void main(String[] args) {
        TreeNode fuck = new TreeNode(1);
        fuck.left = new TreeNode(2);
        fuck.right = new TreeNode(1);
        fuck.left.left = new TreeNode(3);
        fuck.right.left = new TreeNode(5);
        System.out.println(new Solution().maxPathSum(fuck));
    }
}

/**
 * 接近暴力法，通过深度优先尝试每个节点，取最大值
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

class Solution{
    /**
     * 获取最大的单分支
     * @param node
     * @return
     */
    public int maxPathSum(TreeNode node){
        if(node == null)
            return 0;
        else{
            return node.val+Math.max(maxPathSum(node.left),maxPathSum(node.right));
        }
    }
}
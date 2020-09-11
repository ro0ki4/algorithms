package pan.xu.二叉树;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/***
 * 给定一个非空二叉树，返回其最大路径和。
 *
 * 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 *
 *        1
 *       / \
 *      2   3
 *
 * 输出: 6
 * 题号：124
 *
 * 首先编写一个可以获取到必定通过某个点的最大值的函数，遍历所有的点
 */

public class 二叉树中最大的路径和 {
    public static void main(String[] args) {
//        HashMap<Integer,String> aa = new HashMap<>();
//        aa.put(1, "1");
//        aa.put(1,"2");
//        System.out.println(aa.values());
//        for(Integer bb:aa.keySet()){
//            System.out.println(bb);
//            System.out.println(aa.get(bb));
//        }
          int a = 2;
          int b = 7;
          System.out.println(a&b);
        HashSet<String> aa = new HashSet<>();
        for(String bb:aa){
            System.out.println(bb);
        }
//        ArrayList<Node> hehe = new ArrayList<>();
//        hehe.add(null);
//        System.out.println(hehe.size());
    }
    public static UtilNode copyTree(Node head,UtilNode utilHead){
        if(head == null)
            return null;
        utilHead.val = head.val;
        UtilNode utilLeftChild = (head.left == null) ? null : new UtilNode(head.left.val);
        UtilNode utilRightChild = (head.right == null) ? null : new UtilNode(head.right.val);
        utilHead.left = utilLeftChild;
        utilHead.right = utilRightChild;
        if(utilLeftChild != null)
            utilLeftChild.father = utilHead;
        if(utilRightChild != null)
            utilRightChild.father = utilHead;
        if(head.left == null)
            return null;
        copyTree(head.left,utilHead.left);
        if(head.right == null)
            return null;
        copyTree(head.right,utilHead.right);
        return utilHead;
    }
    public static int solution(Node head){
        int num = 0;
        ArrayList<Node> list = new ArrayList<>();
        list.add(head);
        while(true){
            if(list.isEmpty())
                break;
            head = list.get(0);
            if(head.left != null)
                list.add(head.left);
            if(head.right != null)
                list.add(head.right);
            list.remove(0);
            int flag = 2*head.val + getMax(head.left)+getMax(head.right);
            if(flag <= 0)
                ;
            else {
                num = Math.max(num,flag);
            }
        }
        return num;
    }

    public static int getMax(Node head){//通过该点的单链最长
        if(head == null)
            return 0;
        return Math.max((head.val + Math.max(getMax(head.left),getMax(head.right))),0);
    }
}

class UtilNode{
    UtilNode father;
    UtilNode left;
    UtilNode right;
    int val;
    public UtilNode(){}
    public UtilNode(int val){
        this.val = val;
    }
    public void setFather(UtilNode father){
        this.father = father;
    }
}
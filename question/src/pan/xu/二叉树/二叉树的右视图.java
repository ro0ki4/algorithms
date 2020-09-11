package pan.xu.二叉树;
/*
* 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。

示例:

输入: [1,2,3,null,5,null,4]
输出: [1, 3, 4]
解释:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

* */

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class 二叉树的右视图 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> list2 = new ArrayList<>();
        for(Integer i : list){
            list2.add(i);
        }
        System.out.println(list+"  "+list2);
        for(Integer val:list2){
            if(val%2==0){
                list.add(val*10);
            }
        }
        for(Integer val:list){
            System.out.print(val+" ");
        }
        list.remove(0);
        list.remove(0);
        for(Integer val:list){
            System.out.print(val+" ");
        }
        Node fail = new Node(1);
        fail.left = new Node(2);
        fail.right = new Node(3);
        fail.left.right = new Node(5);
        fail.right.right = new Node(4);
        fail.left.right.left = new Node(6);
        show(fail);
        show2(fail,0);
        for(int i = 0; i <level.size(); i++){
            System.out.print(level.get(i).val+" ----- ");
        }

        ArrayList<Integer> aa = new ArrayList<>();
        LinkedList<Integer> bb = new LinkedList<>();
        LinkedHashSet<Integer> cc = new LinkedHashSet<>();
        TreeSet<Integer> dd = new TreeSet<>();
        HashMap<Integer,String> ee = new HashMap<>();
        ConcurrentHashMap<Integer,String> ff = new ConcurrentHashMap<>();

    }

    /**
     * 层次遍历
     * @param node
     */
    public static void show(Node node){
        if(node == null)
            return;
        System.out.println(node.val);
        List<Node> nodeList = new ArrayList<>();
        List<Node> res = new ArrayList<>();
        List<Node> list = new ArrayList<>();
        nodeList.add(node);
        while(!nodeList.isEmpty()){
            res.add(nodeList.get(nodeList.size()-1));
            for(Node i:nodeList){
                list.add(i);
            }
            for(Node i:list){
                if(i.left != null)
                    nodeList.add(i.left);
                if(i.right != null)
                    nodeList.add(i.right);
                nodeList.remove(0);
            }
            list.clear();
        }
        for(Node i:res){
            System.out.print(i.val + "  ");
        }
    }
    /**
     * 深度优先
     *
     * */
    static Map<Integer,Node> level = new HashMap<>();
    public static void show2(Node node,int i){
        if(node == null)
            return;
        level.put(i,node);
        show2(node.left,i+1);
        show2(node.right,i+1);
    }


}

class Node{
    int val;
    Node left;
    Node right;
    public Node(){}
    public Node(int val){
        this.val = val;
    }
}


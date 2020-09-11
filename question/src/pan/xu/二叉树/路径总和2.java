package pan.xu.二叉树;

import java.util.ArrayList;
import java.util.List;

public class 路径总和2 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(2);

        solution aa = new solution();

        List<List<Integer>> ss = aa.pathSum(root,5);

        System.out.println(ss.size());

        for(List<Integer> a:ss){
            for(Integer b:a){
                System.out.println(b);
            }
        }
    }
}

class solution{
    public List<List<Integer>> pathSum(Node root, int sum){
        List<List<Integer>> reslist = new ArrayList<List<Integer>>();
        List<Integer> midlist = new ArrayList<>();

        aaa(root,sum,midlist,reslist);

        return reslist;
    }

    public void aaa(Node root,int sum,List<Integer> midlist,List<List<Integer>> reslist){
        if(root == null) {
            midlist.add(0);
            return;
        }
        midlist.add(root.val);
        if(root.left==null&&root.right==null){
            int count = 0;
            for(Integer a:midlist){
                count += a;
            }
            if(count == sum)
                reslist.add(new ArrayList<>(midlist));
            return;
        }
        aaa(root.left,sum,midlist,reslist);
        midlist.remove(midlist.size()-1);
        aaa(root.right,sum,midlist,reslist);
        midlist.remove(midlist.size()-1);
        return;
    }
}

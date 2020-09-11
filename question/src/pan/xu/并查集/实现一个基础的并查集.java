package pan.xu.并查集;

/**
 * @author ro0ki4
 * @data 2020/9/4 10:24
 * version 1.0
 */
public class 实现一个基础的并查集 {
    public static void main(String[] args) {
        并查集 h = new 并查集();
        h.union(22,33);
        h.union(22,44);
        h.union(22,55);
        System.out.println(h.find(22) + " " + h.find(33) + "  " + h.find(55));

        System.out.println(1 + 2 + "hh" + 33);
    }


}


class 并查集{
    final int size = 100;
    int[] parent = new int[size];

    /**
     * 初始化并查集，每个节点都是自己的元节点
     * @param parent
     */
    public void init(int[] parent){
        for(int i = 0; i < parent.length; i++){
            parent[i] = i;
        }
    }

    public 并查集(){
        init(parent);
    }
    /**
     * 将节点 x 和节点 y 串联起来
     * @param x
     * @param y
     */
    public void union(int x,int y){
        int val1 = find(x);//寻找到x的元节点
        int val2 = find(y);//寻找到y的元节点
        if(val1 != val2){
            parent[val1] = val2;//修改x的元节点为y元节点的子节点
        }
    }



    /**
     * 起到两个作用，一边查找，一边状态压缩
     * @param x
     * @return
     */
    public int find(int x){
        while(parent[x] != x){
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
}
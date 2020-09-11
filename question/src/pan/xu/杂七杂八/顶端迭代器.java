package pan.xu.杂七杂八;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class 顶端迭代器{
    public static void main(String[] args) {
        List<Integer> bb = new ArrayList<>();
        bb.add(1);
        bb.add(2);
        bb.add(3);
        hh aa = new hh(bb);
        System.out.println(aa.next());
        System.out.println(aa.peek());
        System.out.println(aa.next()+";;;;;;"+aa.next());
        System.out.println(aa.hasNext());
    }
}

class hh implements Iterator<Integer> {

    private ArrayList<Integer> arr = new ArrayList<>();
    private Integer size = new Integer(0);
    private Integer local = new Integer(0);

    public hh(Iterator<Integer> iterator){
        while(iterator.hasNext()){
            arr.add(iterator.next());
        }
        this.size = arr.size();
        this.local = 0;
    }

    public hh(List<Integer> list){
        for(Integer integer: list){
            arr.add(integer);
        }
    }

    public Integer peek(){
        return arr.get(local);
    }

    @Override
    public boolean hasNext() {
        if(local <= size -1)
            return true;
        else
            return false;
    }

    @Override
    public Integer next() {
        local = local + 1;
        return arr.get(local-1);
    }
}

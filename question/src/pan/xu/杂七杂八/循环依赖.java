package pan.xu.杂七杂八;

public class 循环依赖 {
    public static void main(String[] args) {
        bb q = new bb();
        aa w = new aa();
        q.a = w;
        w.b = q;
        System.out.println(q.name+"   "+q.a.name);
        System.out.println(w.name+"   "+w.b.name);

        int[] hh = new int[11];

    }
}

class aa{
    String name = "aa";
    bb b;
    public aa(){};
}

class bb{
    String name = "bb";
    aa a;
    public bb(){};
}



package pan.面试题.广联达;

/**
 * @author ro0ki4
 * @data 2020/7/23 11:42
 * version 1.0
 */
public class 测试继承关系 {
    public static void main(String[] args) {
        A a = new B();
        ss(a);
    }

    public static void ss(A a){
        a.show();
    }
}

class A{
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    public void show(){
        System.out.println("B");
    }
}



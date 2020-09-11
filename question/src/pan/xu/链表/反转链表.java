package pan.xu.链表;

public class 反转链表 {
    public static void main(String[] args) {
        node root = new node(0);
        root.next = new node(1);
        root.next.next = new node(2);
        root.next.next.next = new node(3);
        root.next.next.next.next = new node(4);
        solu2(root);
        while(root != null){
            System.out.println(root.val);
            root = root.next;
        }



    }
    static void solution(node head){
        node yuantou = head.next;
        node daicha = yuantou.next;
        yuantou.next = null;
        node daichahou = daicha.next;

        while(true){
            head.next = daicha;

            daicha.next = yuantou;
            yuantou = daicha;
            daicha = daichahou;
            if(daicha == null) {
                break;
            }
            daichahou = daichahou.next;
        }
    }

    static node solu2(node head){
        node daicha;
        node daichahou;

        daicha = head.next;
        node a = head.next;
        daichahou = daicha.next;

        while(daicha != null){
            daicha.next = head.next;
            head.next = daicha;
            daicha = daichahou;
            if(daicha == null) {
                a.next = null;
                break;
            }
            daichahou = daicha.next;

        }
        return head;
    }
}





class node{
    node next;
    int val;
    public node(int val){
        this.val = val;
    }
}
package pan.xu.链表;


public class 奇偶链表 {

    public static void main(String[] args) {
        ListNode hh = new ListNode(1);
        hh.next = new ListNode(2);
        hh.next.next = new ListNode(3);
        hh.next.next.next = new ListNode(4);
        hh.next.next.next.next = new ListNode(5);
        ListNode bb = oddEvenList(hh);
        while(bb != null){
            System.out.println(bb.val);
            bb = bb.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode jt = head;//o
        ListNode oh = head.next;
        ListNode ot = oh;//e
        while(jt.next != null && ot.next != null){
            jt.next = ot.next;
            ot.next = jt.next.next;
            jt = jt.next;
            ot = ot.next;
//            jt.next = ot.next;
//            jt = jt.next;
//            ot.next = jt.next;
//            ot = ot.next;
        }
        jt.next = oh;
        return head;
    }

    public static ListNode oddEvenList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // head 为奇链表头结点，o 为奇链表尾节点
        ListNode o = head;
        // p 为偶链表头结点
        ListNode p = head.next;
        // e 为偶链表尾节点
        ListNode e = p;
        while (o.next != null && e.next != null) {
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }
        o.next = p;
        return head;
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}

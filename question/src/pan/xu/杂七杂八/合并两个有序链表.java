package pan.xu.杂七杂八;


public class 合并两个有序链表 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode ss = ww(l1,l2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
                head.next = l2;
                break;
            }
            if(l2 == null){
                head.next = l1;
                break;
            }
            if(l1.val < l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            //System.out.println(head.val);
            head = head.next;
        }
        return res.next;
    }

    public static ListNode ww(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        while(l1 != null && l2 != null){
            if(l1 == null){
                head.next = l2;
                break;
            }
            if(l2 == null){
                head.next = l1;
                break;
            }
            if(l1.val < l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            //System.out.println(head.val);
            head = head.next;
        }
        return res.next;
    }

    static ListNode solution(ListNode l1, ListNode l2) {
        ListNode i = l1;
        ListNode j = l2;
        ListNode head = new ListNode(0);
        ListNode res=head;
        while (true) {
            if (i==null&&j==null) {
                break;
            }
            //如果有一个链表已经到底了
            if(i==null||j==null){
                if(i==null){
                    while(j!=null){
                        head.next=j;
                        head=head.next;
                        j=j.next;
                    }
                } else{
                    while(i!=null){
                        head.next=i;
                        head=head.next;
                        i=i.next;
                    }
                }
                break;
            }
            if (i.val > j.val) {
                head.next = j;
                j = j.next;
            } else {
                head.next = i;
                i = i.next;
            }
            head = head.next;
        }
        return res.next;
    }
}



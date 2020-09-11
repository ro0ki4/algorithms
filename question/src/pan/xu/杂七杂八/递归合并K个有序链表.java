package pan.xu.杂七杂八;

public class 递归合并K个有序链表 {
    public static void main(String[] args) {

    }

    static ListNode solution1(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val) {
            l1.next = solution1(l1.next, l2);
            return l1;
        }
        else {
            l2.next = solution1(l1, l2.next);
            return l2;
        }
    }

    static ListNode solution2(ListNode[] lists,int l,int r){
        if(l>=r) return lists[l];
        int mid=(r-l)/2;
        ListNode l1 = solution2(lists, l, mid);
        ListNode l2 = solution2(lists, mid + 1, r);
        return solution1(l1, l2);
    }
}

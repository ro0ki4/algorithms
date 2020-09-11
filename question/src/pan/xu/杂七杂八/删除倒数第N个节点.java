package pan.xu.杂七杂八;

public class 删除倒数第N个节点 {
    public static void main(String[] args) {

    }

    static ListNode solution(ListNode head, int n){
        ListNode flag=head;
        int num=1;
        while(flag.next!=null){
            flag=flag.next;
            num++;
        }
        flag=head;
        int aa = num - n + 1;
        if(aa==1)
            return head.next;
        while(aa>2){
            aa--;
            flag=flag.next;
        }
        flag.next = flag.next.next;
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
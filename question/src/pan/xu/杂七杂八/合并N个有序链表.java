package pan.xu.杂七杂八;

public class 合并N个有序链表 {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        ListNode a=new ListNode(1);
        a.next = new ListNode(4);
        ListNode b = new ListNode(1);
        b.next = new ListNode(5);
        ListNode c = new ListNode(2);
        c.next = new ListNode(4);
        lists[0] = a;
        lists[1]=b;
        lists[2] = c;
        ListNode res = solution(lists);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }

    static ListNode solution(ListNode[] lists){
        if(lists.length==1)
            return lists[0];
        ListNode[] points = new ListNode[lists.length];
        ListNode head = new ListNode(0);//新链表的头节点
        ListNode res = head;


        for(int i=0;i<lists.length;i++){
            //使points中存储指向各个链表节点的指针
            points[i] = lists[i];
        }



        while(!check(points)) {
            int j = 0;
            //将j和var都赋值为第一个不为空的值
            for(int i=0;i<points.length;i++){
                if(points[i]!=null) {
                    j=i;
                    break;
                }
            }

            for (int i=j; i < points.length; i++) {
                if(points[i]==null) {
                    continue;
                }

                if (points[i].val < points[j].val) {
                    j=i;
                }
            }

            head.next=points[j];
            head=head.next;
            //System.out.println(j);
            points[j]=points[j].next;

        }

        return res.next;
    }
    static boolean check(ListNode[] lists){//都为空返回true
        int i=0;
        for(;i<lists.length;i++){
            if(lists[i]!=null)
                break;
        }
        return i==lists.length;
    }
}

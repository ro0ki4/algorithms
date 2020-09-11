package pan.xu.链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 约瑟夫环 {
    public static void main(String[] args) {
//        List<Integer> hh = soll(6,3);
//        for(Integer aa : hh){
//            System.out.println(aa);
//        }
        System.out.println(3);
    }

    static List<Integer> soll(int n,int m){
        ArrayList<Integer> res = new ArrayList<>();
        node head = new node(1);
        node a = head;
        for(int i  = 2; i < n+1; i++){
            a.next = new node(i);
            a = a.next;
        }
        a.next = head;

        node bef = a;
        node lat = head.next;


        while(!(head == bef && head == lat)){
            for(int i = 0; i < m-1; i++){
                bef = bef.next;
                head = head.next;
                lat = lat.next;
            }
            res.add(head.val);
//            head = lat;
//            lat = lat.next;
//            bef.next = head;
            bef.next = lat;
            head = lat;
            lat = lat.next;
        }
        res.add(head.val);
        return res;
    }
}


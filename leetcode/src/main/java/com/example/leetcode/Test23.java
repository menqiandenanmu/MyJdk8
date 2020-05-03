package com.example.leetcode;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/04/08 9:08
 * @version: V1.0
 */
public class Test23 {
    public static void main(String[] args) {
        Solution23 solution23=new Solution23();
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(1);
        ListNode listNode3=new ListNode(2);
        ListNode listNodeHead1=listNode1;
        ListNode listNodeHead2=listNode2;
        ListNode listNodeHead3=listNode3;
        listNode1.next=new ListNode(4);
        listNode1=listNode1.next;
        listNode1.next=new ListNode(5);

        listNode2.next=new ListNode(3);
        listNode2=listNode2.next;
        listNode2.next=new ListNode(4);

        listNode3.next=new ListNode(6);
        listNode3=listNode3.next;
        ListNode[] lists={listNodeHead1,listNodeHead2,listNodeHead3};
        ListNode result =solution23.mergeKLists(lists);
        while(null!=result){
            System.out.println(result.val);
            result=result.next;
        }
    }
}

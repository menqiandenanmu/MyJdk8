package com.example.leetcode;

import lombok.val;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/04/08 9:08
 * @version: V1.0
 */
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comparator= (ListNode o1, ListNode o2)->{return o1.val-o2.val;};
        PriorityQueue<ListNode> priorityQueue=new PriorityQueue(
                /*new Comparator<ListNode>() {
                   // @Override
                    public int compare(ListNode o1, ListNode o2) {
                        return o1.val-o2.val;
                    }
                }*/
                (Comparator<? super ListNode>) (ListNode o1, ListNode o2)->{
                         return o1.val-o2.val;
        }
        );
        for(int i=0;i<lists.length;i++){
            while(null!=lists[i]){
                priorityQueue.add(lists[i]);
                lists[i]=lists[i].next;
            }
        }

        ListNode result=new ListNode(-1);
        ListNode head=result;
        while(!priorityQueue.isEmpty()){
            result.next=priorityQueue.poll();
            result=result.next;
        }
        result.next=null;
        return head.next;
    }
}

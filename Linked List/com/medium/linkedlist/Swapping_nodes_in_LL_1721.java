package com.medium.linkedlist;

import com.medium.linkedlist.Split_LL_in_Parts_725.ListNode;

public class Swapping_nodes_in_LL_1721 {

    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
         ListNode first=head,second=head,fast=head;
         int i=1;
         while(i<k){
             first=first.next;
             fast=fast.next;
             i++;
         }
         
         fast=fast.next;
         while(fast!=null){
             second=second.next;
             fast=fast.next;
         }
         
         int temp=first.val;
         first.val=second.val;
         second.val=temp;
         return head;
     }

}

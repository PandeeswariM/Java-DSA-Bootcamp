package com.medium.linkedlist;

import com.easy.linkedlist.DeleteANodeInLL.ListNode;

public class ReverseLinkedListii_92 {
	public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        
        ListNode prev=null;
        ListNode current=head;
        for(int i=0;current!=null && i<left-1;i++){
            prev=current;
            current=current.next;
        }
        
        ListNode last=prev;
        ListNode Newend=current;
         ListNode next=current.next;
        
        for(int i=0;current!=null && i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        Newend.next=current;
        return head;
        
    }

}

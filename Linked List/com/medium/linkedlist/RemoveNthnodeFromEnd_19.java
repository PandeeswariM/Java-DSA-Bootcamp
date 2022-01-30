package com.medium.linkedlist;

import com.easy.linkedlist.DeleteANodeInLL.ListNode;

public class RemoveNthnodeFromEnd_19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode fast=head,slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        //slow.val=slow.next.val;
        slow.next=slow.next.next;
        return head;
    }

	
}

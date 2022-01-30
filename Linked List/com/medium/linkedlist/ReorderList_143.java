package com.medium.linkedlist;

import com.easy.linkedlist.DeleteANodeInLL.ListNode;

public class ReorderList_143 {
	public void reorderList(ListNode head) {
	       if(head==null || head.next==null){
	           return;
	       } 
	        ListNode mid=middleNode(head);
	        ListNode hs=reverseList(mid);
	        ListNode hf=head;
	        
	        while(hf!=null && hs!=null){
	            ListNode temp=hf.next;
	            hf.next=hs;
	            hf=temp;
	            
	            temp=hs.next;
	            hs.next=hf;
	            hs=temp;
	        }
	        if(hf!=null){
	            hf.next=null;
	        }
	    }
	    
	    public ListNode middleNode(ListNode head) {
	        ListNode s=head;
	        ListNode f=head;
	        while(f!=null && f.next!=null){
	            s=s.next;
	            f=f.next.next;
	        }
	        return s;
	    }
	    
	    public ListNode reverseList(ListNode head) {
	        if(head==null){
	            return head;
	        }
	        ListNode prev=null;
	        ListNode pres=head;
	        ListNode next=pres.next;
	        while(pres!=null){
	            pres.next=prev;
	            prev=pres;
	            pres=next;
	            if(next!=null){
	                next=next.next;
	            }
	        }
	        return prev;
	    }

}

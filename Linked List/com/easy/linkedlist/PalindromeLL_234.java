package com.easy.linkedlist;

import com.easy.linkedlist.DeleteANodeInLL.ListNode;

public class PalindromeLL_234 {
	public boolean isPalindrome(ListNode head) {
	       ListNode mid=middleNode(head);
	       ListNode headSecond=reverseList(mid);
	        ListNode reverseHead=headSecond;
	        
	        while(head!=null &&  headSecond!=null){
	            if(head.val!=headSecond.val){
	                break;
	            }
	            head=head.next;
	            headSecond=headSecond.next;
	        }
	        reverseList(reverseHead);
	        return head==null||headSecond==null;
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
	    
	    public ListNode middleNode(ListNode head) {
	        ListNode s=head;
	        ListNode f=head;
	        while(f!=null && f.next!=null){
	            s=s.next;
	            f=f.next.next;
	        }
	        return s;
	    }
		
		

}

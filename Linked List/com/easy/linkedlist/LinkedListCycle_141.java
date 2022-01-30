package com.easy.linkedlist;

public class LinkedListCycle_141 {
	
	public boolean hasCycle(ListNode head) {
	      ListNode slow=head;
	      ListNode fast=head;
	        while(slow!=null && fast!=null){
	            slow=slow.next;
	            if(fast.next==null){
	                return false;
	            }else{
	               fast=fast.next.next;
	            }
	            if(slow==fast){
	                return true;
	            }
	        }
	        return false;
	    }
	
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }


}

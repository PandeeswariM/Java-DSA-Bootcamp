package com.easy.linkedlist;

public class RemoveDuplicates_83 {
	public ListNode deleteDuplicates(ListNode head) {
	     if(head==null || head.next==null){
	         return head;
	     }   
	        ListNode temp=head;
	        while(temp.next!=null){
	            if(temp.val==temp.next.val){
	                temp.next=temp.next.next;
	            }
	            else{
	            temp=temp.next;
	            }
	        }
	        return head;
	    }
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	      ListNode(){
	    	  
	      }
	  }
}

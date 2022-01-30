package com.hard.linkedlist;



public class Reverse_nodes_k_group_25 {
 
	public ListNode reverseKGroup(ListNode head, int k) {
	       int count=0;
	        ListNode dummy=new ListNode(0);
	        dummy.next=head;
	        ListNode temp=dummy;
	        while(temp.next!=null){
	            count++;
	            temp=temp.next;
	        }
	        temp=dummy;
	        while(temp.next!=null){
	            if(count<k) break;
	            int nodes=k-1;
	            ListNode tempNext=temp.next;
	            ListNode first=temp.next;
	            ListNode second=temp.next.next;
	            
	            while(nodes-->0){
	                ListNode next=second.next;
	                second.next=first;
	                first=second;
	                second=next;
	            }
	            count-=k;
	            temp.next=first;
	            tempNext.next=second;
	            temp=tempNext;
	        }
	        return dummy.next;
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

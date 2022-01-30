package com.medium.linkedlist;



public class Swap_node_Pairs_24 {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	public ListNode swapPairs(ListNode head) {
	     if(head==null || head.next==null){
	         return head;
	     }   
	        ListNode node=new ListNode(0);
	        ListNode tail=node;
	        while(head!=null){
	            if(head!=null && head.next!=null){
	                tail.next=new ListNode(head.next.val);
	                tail=tail.next;
	                tail.next=new ListNode(head.val);
	                tail=tail.next;
	                tail.next=null;
	            }
	            if(head!=null && head.next==null){
	                tail.next=head;
	                tail=tail.next;
	                tail.next=null;break;
	            }
	            if(head!=null && head.next!=null && head.next.next!=null){
	                head=head.next.next;
	            }
	            else{
	                break;
	            }
	        }
	        return node.next;
	    }

}

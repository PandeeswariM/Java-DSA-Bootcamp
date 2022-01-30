package com.easy.linkedlist;

public class RemoveLinkedListElements_203 {
	public ListNode removeElements(ListNode head, int val) {
	       ListNode node=new ListNode(0,head);
	        compute(node,val);
	        return node.next;
	    }
	    public void compute(ListNode node,int val){
	        if(node==null || node.next==null){
	            return;
	        }
	        if(node.next.val==val){
	            node.next=node.next.next;
	        }
	        else{
	            node=node.next;
	        }
	        compute(node,val);
	    }
	    
	    
	    public class ListNode {
	    	     int val;
	    	      ListNode next;
	    	      ListNode() {}
	    	      ListNode(int val) { this.val = val; }
	    	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	    	  }
}

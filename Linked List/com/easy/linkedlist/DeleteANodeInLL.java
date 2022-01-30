package com.easy.linkedlist;


public class DeleteANodeInLL {
	public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
	public class ListNode {
	     int val;
	      public ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
}

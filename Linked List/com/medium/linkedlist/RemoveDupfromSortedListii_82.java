package com.medium.linkedlist;

import com.medium.linkedlist.Add2numbers2_445.ListNode;

public class RemoveDupfromSortedListii_82 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
    public ListNode deleteDuplicates(ListNode head) {
    ListNode h = new ListNode(-101, head);
     head = h;
    while(h!=null){
	ListNode curr = h.next;
	while(curr!=null && curr.next!=null && curr.val==curr.next.val){
		curr = curr.next;
	}
	if( h.next==curr && (curr== null || h.val!=curr.val) ){
		h.next = curr;
		h = h.next;
	}else{
		h.next = curr.next;
	}
}
      return head.next;

    }

}

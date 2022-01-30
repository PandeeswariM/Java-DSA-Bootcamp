package com.medium.linkedlist;



public class DeleteMiddleNode_2095 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(s.next!=null){
        s.val=s.next.val;
        s.next=s.next.next;
        }
        else{
             head.next=null;
        }
        return head;
    }
}

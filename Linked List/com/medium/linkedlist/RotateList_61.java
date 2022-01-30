package com.medium.linkedlist;


public class RotateList_61 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode prev=null,curr=head;
        int size=0;
        while(curr!=null){
            prev=curr;
            curr=curr.next; size++;
        }
        curr=head;
        prev.next=curr;
        int rotate=k%size;
        int location=size-rotate;
        for(int i=0;i<location;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        return curr;
    }
}

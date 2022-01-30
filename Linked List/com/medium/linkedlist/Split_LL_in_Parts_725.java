package com.medium.linkedlist;



public class Split_LL_in_Parts_725 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int totalLen=0;
        ListNode temp=head;
        while(temp!=null){
          totalLen++;
          temp=temp.next;
        }
        int len=totalLen/k;
        int dist=totalLen%k;
        ListNode prev=null;
        ListNode node=head;
        int i=0;
        while(node!=null){
            ans[i]=node;
            for(int j=0;j<len+(dist>0?1:0);j++){
               prev=node;
                node=node.next;
            }
            prev.next=null; i++;dist--;
        }
        return ans;
    }
}

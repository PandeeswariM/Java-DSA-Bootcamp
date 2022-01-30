package com.medium.linkedlist;


public class Remove_zero_sum_cons_1171 {
	public ListNode removeZeroSumSublists(ListNode head) {
        ListNode head1 = new ListNode();
        head1.next = head;
        ListNode prev = head1;
        ListNode temp = head;
        while(temp!=null)
        {
            ListNode node = SkipZeroSum(temp);
            
            if(node!=temp)
            {
                prev.next = node;
                temp = node;
            }
            else
            {
                prev= temp;
                temp = temp.next;
            }
        }
        
        return head1.next;
        
    }
    
    public ListNode SkipZeroSum(ListNode node){
        
        int sum =0;
        ListNode temp = node;
        
        while(temp!=null)
        {
            sum+=temp.val;
            if(sum==0)
            {return temp.next;}
            else
            {temp=temp.next;}
        }
        return node;
 
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

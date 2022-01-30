package com.medium.linkedlist;



public class LinkedListCycle2_142 {
    public int lengthCycle(ListNode head){
        ListNode slow=head;
       ListNode fast=head;
        while(fast.next!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
              return length;
            }

        }
          return 0;        

    }
    public ListNode detectCycle(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                length=lengthCycle(slow);
                //ListNode temp=slow;
                 break;
            }
            
        }
        if(length==0) return null;
        ListNode s=head;
        ListNode f=head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return s;
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

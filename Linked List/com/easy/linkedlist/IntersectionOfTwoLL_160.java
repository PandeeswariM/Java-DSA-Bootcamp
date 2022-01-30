package com.easy.linkedlist;



public class IntersectionOfTwoLL_160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	       int lenA=0;
	        ListNode tempA=headA; 
	        while(tempA!=null){
	           lenA++;
	            tempA=tempA.next;
	        }
	        
	         int lenB=0;
	        ListNode tempB=headB; 
	        while(tempB!=null){
	           lenB++;
	            tempB=tempB.next;
	        }
	      
	        int skip=Math.abs(lenA-lenB);
	        tempA=headA;
	        tempB=headB;
	        if(lenA>lenB){
	            while(skip-- >0){
	                tempA=tempA.next;
	            }
	        }
	        else{
	               while(skip-- >0){
	                tempB=tempB.next;
	            }
	          }
	        while(tempA!=tempB){
	            tempA=tempA.next;
	            tempB=tempB.next;
	            if(tempA==null || tempB==null){
	                return null;
	            }
	        }
	        return tempA;
	    }
	
	public class ListNode {
	     int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

}

package com.medium.linkedlist;

import java.util.Stack;



public class Add2numbers2_445 {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     Stack<Integer> stack1=new Stack<>();
     Stack<Integer> stack2=new Stack<>();
     while(l1!=null) {
    	 stack1.add(l1.val);
    	 l1=l1.next;
     }
     while(l2!=null) {
    	 stack2.add(l2.val);
    	 l2=l2.next;
     }
     int carry=0;
     ListNode result=null;
     while(!stack1.isEmpty() || !stack2.isEmpty()) {
    	 int x=!stack1.isEmpty()?stack1.pop():0;
    	 int y=!stack2.isEmpty()?stack2.pop():0;
    	 int sum=x+y+carry;
    	 ListNode temp=new ListNode(sum%10);
    	 carry=sum/10;
    	 if(result==null) {
    		 result=temp;
    	 }
    	 else {
    		 temp.next=result;
    		 result=temp;
    	 }
     }
     if(carry!=0) {
    	 ListNode temp=new ListNode(carry);
    	 temp.next=result;
    	 result=temp;
     }
    	return result;
    }
	
}

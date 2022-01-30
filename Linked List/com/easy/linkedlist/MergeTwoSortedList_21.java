package com.easy.linkedlist;


public class MergeTwoSortedList_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode tempHead=new ListNode();
        ListNode tail=tempHead;
        
        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
              tail.next=list2;
                list2=list2.next;
                tail=tail.next;  
            }
        }
        tail.next=(list1!=null)?list1:list2;
        return tempHead.next;
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

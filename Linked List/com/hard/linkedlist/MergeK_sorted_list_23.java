package com.hard.linkedlist;


public class MergeK_sorted_list_23 {
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
        int interval=1;
        while(interval<lists.length){
            for(int i=0;i+interval<lists.length;i=i+interval*2){
                lists[i]=mergeTwoLists(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];
    }
    
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
    
    public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

}

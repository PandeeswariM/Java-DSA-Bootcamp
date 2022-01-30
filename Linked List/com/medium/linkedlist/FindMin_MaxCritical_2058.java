package com.medium.linkedlist;

//import com.medium.linkedlist.DeleteMiddleNode_2095.ListNode;

public class FindMin_MaxCritical_2058 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1;
        int last=-1;
        ListNode l=head;
        ListNode m=head.next;
        ListNode r=head.next.next;
        int min=Integer.MAX_VALUE,index=1;
        while(r!=null){
            if((m.val<l.val && m.val<r.val) || (m.val>l.val && m.val>r.val)){
                if(first==-1){
                    first=index;
                    last=index;
                }
                else{
                    min=Math.min(min,index-last);
                    last=index;
                }
            }
            l=m;
            m=r;
            r=r.next;
            index++;
        }
        int[] result=new int[2];
        if(first==last){
            result[0]=-1;
            result[1]=-1;
        }
        else{
            result[0]=min;
            result[1]=last-first;
        }
        return result;

}
}
package com.medium.linkedlist;

import com.medium.linkedlist.Remove_zero_sum_cons_1171.ListNode;

public class Reverse_in_even_length_2074 {
	public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp = head;
        int count = 1;
        int height = height(head);
        while (head != null) {
            if (count%2 == 0) {
                if (height < count && height %2 == 1)
                    break;
                ListNode next = head.next;
                head.next = reverse(head.next, count);
                head = next;
                if (height < count)
                    break;
            }
            else {
                if (height < count) {
                    if (height %2 == 1)
                        break;
                    else {
                        count++;
                        continue;
                    }
                }
                int index = count;
                while (head != null && index-- > 0 && count !=1) 
                    head = head.next;
            }
            height -= count;
            count++;
        }
        return temp;
    }
    public int height (ListNode head) {
        int height = 0;
        while (head != null) {
            head = head.next;
            height++;
        }
        return height;
    }
    
    public ListNode reverse(ListNode head, int count) {
        if (head == null)
            return head;
        ListNode pointer = head, prev = null;
        while (head != null && count-- > 0) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        pointer.next = head;
        return prev;
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

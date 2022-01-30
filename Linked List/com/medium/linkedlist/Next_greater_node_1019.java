package com.medium.linkedlist;
import java.util.*;

import com.medium.linkedlist.LL_Random_Node_382.ListNode;



public class Next_greater_node_1019 {
	public static int[] nextLargerNodes(ListNode head) {
        Stack<Integer> revList = reverseList(head);
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[revList.size()];
        int i = nge.length - 1;

        while (!revList.isEmpty()) {
            while (!stack.isEmpty() && revList.peek() >= stack.peek())
                stack.pop();
            nge[i--] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(revList.pop());
        }
        return nge;
    }

    public static Stack<Integer> reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        return stack;
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

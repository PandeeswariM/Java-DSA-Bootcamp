package com.medium.linkedlist;

import java.util.*;
import java.util.Random;

public class LL_Random_Node_382 {
	List<Integer> l;
    Random rnd;
    public LL_Random_Node_382(ListNode head) {
        l = new LinkedList<>();
        rnd = new Random();
        
        ListNode curr = head;
        
        while(curr != null){
            l.add(curr.val);
            curr = curr.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        return l.get(rnd.nextInt(l.size()));
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

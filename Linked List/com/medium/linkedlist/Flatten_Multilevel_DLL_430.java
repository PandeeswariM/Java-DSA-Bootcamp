package com.medium.linkedlist;

public class Flatten_Multilevel_DLL_430 {
	class Node {
	    public int val;
	    public Node prev;
	    public Node next;
	    public Node child;
	}
	public Node flatten(Node head) {
        Node cur = head;
        
        
        while(cur != null){ 
            
            if(cur.child == null){
                cur = cur.next;
                continue;
            }
            
            Node next = cur.next;
            Node childTail = getChildTail(cur.child);
            cur.next = cur.child;
            cur.child.prev = cur;
            childTail.next = next;
            
            if(next != null)
                next.prev = childTail;
            
            cur.child = null;
            cur = cur.next;
        }
        
        return head;
    }
    
    public Node getChildTail(Node child){
        while(child.next != null)
            child = child.next;
        return child;
    }
}

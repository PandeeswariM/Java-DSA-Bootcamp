
package com.medium.linkedlist;
import java.util.*;

public class LRU_cache_146 {
	class Node{
	    int key,value;
	    Node prev,next;
	    Node(int key,int value){
	        this.key=key;
	        this.value=value;
	    }
	}
	    Node head=new Node(0,0);
	    Node tail=new Node(0,0);
	    int capacity;
	    Map<Integer,Node> map=new HashMap<>();
	    public void LRUCache(int capacity) {
	        this.capacity=capacity;
	        head.next=tail;
	        tail.prev=head;
	    }
	    
	    public int get(int key) {
	        if(map.containsKey(key)){
	            Node data=map.get(key);
	            remove(data);
	            insert(data);
	            return data.value;
	        }
	        return -1;
	    }
	    
	    public void put(int key, int value) {
	        if(map.containsKey(key)){
	            remove(map.get(key));
	        }
	        if(capacity==map.size()){
	            remove(tail.prev);
	        }
	        insert(new Node(key,value));
	    }
	    
	    void remove(Node node){
	        map.remove(node.key);
	        node.prev.next=node.next;
	        node.next.prev=node.prev;
	    }
	    
	    void insert(Node node){
	        map.put(node.key,node);
	        Node headNext=head.next;
	        head.next=node;
	        node.prev=head;
	        headNext.prev=node;
	        node.next=headNext;
	    }
}

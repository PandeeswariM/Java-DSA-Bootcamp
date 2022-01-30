package com.hard.linkedlist;

import java.util.*;

public class LFU_Cache_460 {
	class Node {
	    int key, value, freq;
	    Node prev, next;
	    
	    public Node(int key, int value) {
	        this.key = key;
	        this.value = value;
	        this.freq = 0;
	    }
	}

	class DLL {
	    Node tail, head;
	    int length;
	    
	    public DLL() {
	        this.length = 0;
	    };
	    
	    public void addToFirst(Node n) {
	        n.prev = null;
	        n.next = null;
	        if (head == null) {
	            head = tail = n;
	        } else {
	            head.prev = n;
	            n.next = head;
	            head = n;
	        }
	        length++;
	    }
	    
	    public void remove(Node n) {
	        if (n == head) {
	            head = head.next;
	            if (head != null) {
	                head.prev = null;
	            }
	        } else if (n == tail) {
	            tail = tail.prev;
	            if (tail != null) {
	                tail.next = null;
	            }
	        } else {
	            n.next.prev = n.prev;
	            n.prev.next = n.next;
	        }
	        length--;
	    }
	    
	    public Node getLast() {
	        return tail;
	    }
	}

	class LFUCache {
	    
	    Map<Integer, Node> cache;
	    Map<Integer, DLL> freqMap;
	    int minFreq;
	    DLL dll;
	    int maxCapacity;
	    int currCapacity;
	    

	    public LFUCache(int capacity) {
	        this.maxCapacity = capacity;
	        this.currCapacity = 0;
	        this.cache = new HashMap<>();
	        this.freqMap = new HashMap<>();
	        this.minFreq = 1;
	        this.dll = new DLL();
	    }
	    
	    public int get(int key) {
	        if (!cache.containsKey(key)) {
	            return -1;
	        }
	        Node n = cache.get(key);
	        incrementFrequency(n);
	        return n.value;
	    }
	    
	    public void put(int key, int value) {
	        if (maxCapacity <= 0) {
	            return;
	        }
	        if (cache.containsKey(key)) {
	            Node n = cache.get(key);
	            n.value = value;
	            incrementFrequency(n);
	            this.cache.put(key, n);
	        } else {
	            Node n = new Node(key, value);
	            if (this.cache.size() >= maxCapacity) {
	                Node prev = this.freqMap.get(this.minFreq).getLast();
	                this.freqMap.get(this.minFreq).remove(prev);
	                this.cache.remove(prev.key);
	            }
	            incrementFrequency(n);
	            this.minFreq = 1;
	            this.cache.put(key, n);
	        }
	    }
	    
	    private void incrementFrequency(Node n) {
	        int oldFreq = n.freq;
	        if (this.freqMap.containsKey(oldFreq)) {
	            this.freqMap.get(oldFreq).remove(n);
	            if (this.minFreq == oldFreq && this.freqMap.get(oldFreq).length == 0) {
	                this.minFreq++;
	            }
	        }
	        
	        int newFreq = oldFreq + 1;
	        n.freq = newFreq;
	        if (!this.freqMap.containsKey(newFreq)) {
	            this.freqMap.put(newFreq, new DLL());
	        }
	        this.freqMap.get(newFreq).addToFirst(n);
	    }
	    
	}
}

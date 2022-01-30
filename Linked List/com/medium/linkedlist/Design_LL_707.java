package com.medium.linkedlist;

public class Design_LL_707 {
	private Node root;
    private int size;
    
    public void MyLinkedList() {
        root=new Node(0);
        size=0;
    }
    
    
    public int get(int index) {
        
        if(index < 0 || index >= size) return -1;
        
        Node node = root;
        int i=0;
        while(i <= index){
            node = node.next;
            i++;
        }
        return node.val;
    }
    
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    
    public void addAtIndex(int index, int val) {
        
        if(index < 0 || index > size) return;
        
        Node node = root;
        int i=0;
        while(i < index){
            node = node.next;
            i++;
        }
        Node newNode = new Node(val);
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }
    
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        
        Node node = root;
        int i=0;
        while(i < index){
            node = node.next;
            i++;
        }
        node.next = node.next.next;
        size--;        
    }
}

class Node {    
    int val;
    Node next; 
    Node(int x){
        val = x;
    }
}

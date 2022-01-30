package com.hard.linkedlist;

public class Design_SkipList_1206 {
	class Skiplist{
	int MAX_LEVEL = 10;
    class Node{
        int val;
        Node[] next = new Node[MAX_LEVEL];
        Node(int val){
            this.val = val;
        }
        Node(){}
    }
    
    Node head;
    int curLevel;
    
    public Skiplist() {
        head = new Node();
        curLevel = 0;
    }
    
    public boolean search(int target) {
        // printSL();
        Node cur = head;
        for(int i = curLevel; i >= 0; i--){
            while(cur.next[i] != null && cur.next[i].val < target){
                cur = cur.next[i];
            }
        }
        if(cur.next[0] != null && cur.next[0].val == target) return true;
        else return false;
    }
    
    public void add(int num) {
        Node cur = head;
        Node[] updates = new Node[MAX_LEVEL];
        for(int i = curLevel; i >= 0; i--){
            while(cur.next[i] != null && cur.next[i].val < num){
                cur = cur.next[i];
            }
            updates[i] = cur;
        }
        int lvl = randomLevel(0.5);
        Node newNode = new Node(num);
        if(lvl > curLevel){
            for(int i = curLevel+1; i <= lvl; i++){
                updates[i] = head;
            }
            curLevel = lvl;
        }
        for(int i = 0; i <= lvl; i++){
            newNode.next[i] = updates[i].next[i];
            updates[i].next[i] = newNode;
        }
    }
    
    public boolean erase(int num) {
        Node cur = head;
        Node[] updates = new Node[MAX_LEVEL];
        for(int i = curLevel; i >= 0; i--){
            while(cur.next[i] != null && cur.next[i].val < num){
                cur = cur.next[i];
            }
            updates[i] = cur;
        }
        boolean ans = false;
        for(int i = 0; i < curLevel; i++){
            if(updates[i].next[i] != null && updates[i].next[i].val == num){
                updates[i].next[i] = updates[i].next[i].next[i];
                ans = true;
            } else {
                break;
            }
        }
        while(curLevel > 0 && head.next[curLevel] == null){
            curLevel--;
        }
        return ans;
    }
    
    private int randomLevel(double p){
        int lvl = 0;
        while(lvl < (MAX_LEVEL-1) && Math.random() < p){
            lvl++;
        }
        return lvl;
    }
    
    // print for debug
    private void printSL(){
        System.out.println("print SkipList:");
        for(int i = curLevel; i >= 0; i--){
            Node cur = head;
            while(cur.next[i] != null){
                System.out.printf("%d->", cur.next[i].val);
                cur = cur.next[i];
            }
            System.out.println("null");
        }
    }

}
}
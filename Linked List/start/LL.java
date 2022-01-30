package start;

public class LL {

   private Node head;
   private Node tail;
   int size;
   
   private class Node{
	   private int value;
	   private Node next;
	   Node(int value){
		   this.value=value;
	   }
	   Node(int value,Node next){
		   this.value=value;
		   this.next=next;
	   }
   }
   
   LL(){
	   size=0;
   }

   //insert a node at first
   public void insertFirst(int val) {
	   Node node=new Node(val);
	   node.next=head;
	   head=node;
	   
	   if(tail==null) {
		   tail=head;
	   }
	   size++;
   }
   
   //insert a node at last
   public void insertLast(int val) {
	   if(tail==null) {
		   insertFirst(val);
	   }
	   Node node=new Node(val);
	   tail.next=node;
	   tail=node;
	   size++;
   }
   
   //insert a node at given index
   public void insert(int index,int val) {
	   if(index==0) {
		   insertFirst(val);
		   return;
	   }
	   if(size==index) {
		   insertLast(val);
		   return;
	   }
	   
	   Node temp=head;
	   for(int i=1;i<index;i++) {
		   temp=temp.next;
	   }
	   Node node=new Node(val,temp.next);
	   temp.next=node;
	   size++;
   }
   
   //delete a first Node
   public void deleteFirst() {
     	head=head.next;
     	if(head==null) {
     		tail=null;
     	}
         size--;  	
   }
   
   //delete a node at last
   public void deleteLast() {
	   if(size<=1) {
		   deleteFirst();
		   return;
	   }
	   Node secondlast=get(size-2);
	   tail=secondlast;
	   tail.next=null;
	   size--;
	   
   }
   
   //get a node
   private Node get(int index) {
	Node node=head;
	for(int i=0;i<index;i++) {
		node=node.next;
	}
	return node;
  }
   
   //delete a node at given index
   public void delete(int index) {
	   if(index==0) {
		   deleteFirst();
		   return;
	   }
	   if(index==size) {
		   deleteLast();
		   return;
	   }
	   Node prev=get(index-1);
	   prev.next=prev.next.next;
	   size--;
   }
   
   //get a node with a given value
   public Node find(int val) {
	   Node node=head;
	   while(node!=null) {
		   if(node.value==val) {
			   return node;
		   }
		   node=node.next;
	   }
	   return null;
   }

//display nodes
   public void display() {
	   Node temp=head;
	   while(temp!=null) {
		   System.out.print(temp.value+"->");
		   temp=temp.next;
	   }
	   System.out.println("END");

   }
}

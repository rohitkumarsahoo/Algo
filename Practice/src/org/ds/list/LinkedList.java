package org.ds.list;
 class Node{
	 public Node(int data){
		 this.data=data;
		 this.next=null;
	 }
	 public int data;
	 public Node next;
 }

 public class LinkedList {	 
	Node head,tempnode;
	int length=1;
	public Node insertFirst(int data,Node head) {
	  Node list= new Node(data);
		list.next=head;
		head=list;
		return head;
	}
   public Node insertLast(int data,Node head) {
	  Node newNode = new Node(data);
	   if(head==null) {
		   head=newNode;
		   }	   
	   if(head!= null) {
		  tempnode = head;	  
	   while(tempnode.next!= null) {
		   tempnode= tempnode.next;
	   }    	 
    	 tempnode.next=newNode;
	   }
    	 return head;
     }
   public Node insertAny(Node head,int data,int position) {
	   Node newNode = new Node(data);
	   int length = 1;
	   if(head==null) {
		   head=newNode;
		   }	  
	   if(position ==0) {
		   newNode.next=head;
		   return newNode;
	   }
	   if(head!= null) {
		  tempnode = head;
		  while((tempnode!=null)&& length<position) {
			  length=length+1;
			  tempnode=tempnode.next;
		  }
	   
	     newNode.next=tempnode.next;
    	 tempnode.next=newNode;
	   }
    	 return head; 	  
   }
   public Node deleteFirst(Node head) {
	   if(head!=null)
	   head= head.next;
	return head;
   }
   public void show(Node head) {	   
	   Node temp=head;
	   while(temp!= null) {		   
		   System.out.println(temp.data);
	   temp=temp.next;
	   }
   }
   public int length(Node head) {
	   tempnode = head;
	   for(; (tempnode= tempnode.next)!= null;length++);
	   return length;
   } 
   public Node reverse(Node head) {
	   Node temp=null;
	   Node curr=head;
	   Node prev=null;
	   while(curr!=null) {
		   temp=curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=temp;		   
	   }
	   return prev;
   }
   public Node reversePair(Node node) {
	   Node temp=null,head=node;
	   Node temp2=null;
	   while((head!=null)&&(head.next!=null)) {
		   if(temp!=null) {
			   temp.next.next=head.next;
		   }
		   temp= head.next;
		   head.next=temp.next;
		   temp.next=head;
		   if(temp2==null)
			   temp2=temp;
		   head=head.next;
	   }
	   return temp2;
   }
   public Node reverseKNode(Node node,int pos) {
	   Node head=node;
	   Node temp=null,prev=null;
	   int length=0;
	   if(head==null) 
		   return null;
		   while((head!=null)&&length<pos){
			   temp=head.next;
			   head.next=prev;
			   prev=head;
			   head =temp;
			   length++;
		   }
		   node.next=reverseKNode(head, pos);
		   return prev;		   
   }   
   public static void main(String[] args) {
		Node head= new Node(0);
		head.next= new Node(1);
		head.next.next= new Node(2);
		head.next.next.next= new Node(3);
		head.next.next.next.next= new Node(4);
		head.next.next.next.next.next= new Node(5);		
		LinkedList ll= new LinkedList();
		head=ll.reverseKNode(head, 3);
		//head=ll.reversePair(head);		
		ll.show(head);
		
		
}
 }

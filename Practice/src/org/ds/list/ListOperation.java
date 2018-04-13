package org.ds.list;

public class ListOperation {	 
	ListNode head,tempnode;
	 private int length=1;
	public ListNode insertFirst(int data) {
		tempnode=head;
		ListNode list= new ListNode(data);
		list.setNext(tempnode);
		return list;
	}
   public ListNode insertLast(int data) {
	   ListNode newNode = new ListNode(data);
	   if(head==null) {
		   head=newNode;
		   }	   
	   if(head!= null) {
		  tempnode = head;	  
	   while(tempnode.getNext()!= null) {
		   tempnode= tempnode.getNext();
	   }    	 
    	 tempnode.setNext(newNode);
	   }
    	 return head;
     }
   public ListNode insertAny(int data,int position) {
	   ListNode newNode = new ListNode(data);
	   int length = 1;
	   if(head==null) {
		   head=newNode;
		   }	   
	   if(head!= null) {
		  tempnode = head;	  
	   while((tempnode.getNext()!= null)&& length <position) {
		   tempnode= tempnode.getNext();
	   }    	 
    	 tempnode.setNext(newNode);
	   }
    	 return head; 	  
   }
   public ListNode deleteFirst(ListNode node) {
	   if(node!=null)
	   node= node.getNext();
	return node;
   }
   public void show() {
	   
	   ListNode temp=head;
	   while(temp!= null) {		   
		   System.out.println(temp.getData());
	   temp=temp.next;
	   }
   }
   public int length() {
	   tempnode = head;
	   for(; (tempnode= tempnode.getNext())!= null;length++);
	   return length;
   } 
  
}

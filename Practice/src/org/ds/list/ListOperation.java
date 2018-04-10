package org.ds.list;

public class ListOperation {
	 ListNode head;
	 private int length=1;
	public ListNode insertFirst(ListNode node,int data) {
		ListNode list= new ListNode(data);
		list.setNext(node);
		return list;
	}
   public ListNode insertLast(ListNode node,int data) {
	   if(head != null)
	   this.head = node;
	   while(node.getNext()!= null) {
		   node= node.getNext();
	   }
    	 ListNode newNode = new ListNode(data);
    	 node.setNext(newNode);
    	 return head ;
     }
   public int length(ListNode node) {
	   ListNode q= node;
	   for(; (q= q.getNext())!= null;length++);
	   return length;
   }
   public ListNode deleteFirst(ListNode node) {
	   if(node!=null)
	   return node.getNext();
	return node;
   }
}

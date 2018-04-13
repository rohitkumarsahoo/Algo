package org.ds.list;

public class NthNodeFromLast {
	int length= 0;
	public int nPosition(ListNode head,int pos) {
		ListNode temp=head,temp2 = head;
		int length=0,length1=0;
		for(;temp!= null;temp=temp.next) {
			length++;
		}
		for(;length1<length-pos;length1++,temp2=temp2.next) {			
		}
		return temp2.getData();
	}

	 public ListNode recur(ListNode head,int pos) {
		 if(head != null) {
			 recur(head.next, pos);
			 length++;
			 if (pos == length) 
				 return head;
			 }		 
		 return null;
	 }
}

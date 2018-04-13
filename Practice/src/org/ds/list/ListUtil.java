package org.ds.list;

public class ListUtil {

	public static void main(String[] args) {
		ListOperation lo = new ListOperation();
		lo.head= new ListNode(0);
		lo.head.next= new ListNode(1);
		lo.head.next.next= new ListNode(2);
		lo.head.next.next.next= new ListNode(3);
		lo.head.next.next.next.next= new ListNode(4);
		lo.head.next.next.next.next.next= new ListNode(5);
		//lo.show();
		System.out.println(new NthNodeFromLast().recur(lo.head, 5));
	}
}

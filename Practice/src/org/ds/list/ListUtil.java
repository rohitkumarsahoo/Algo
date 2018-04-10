package org.ds.list;

public class ListUtil {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.setNext(new ListNode(1));
		System.out.println(new ListOperation().length(head));
		

	}

}

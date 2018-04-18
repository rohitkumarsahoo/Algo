package org.ds.stack;

import java.util.Stack;

public class Stacks {
   public void reverseStack(Stack<Integer> stk) {
	   if (!stk.isEmpty()) {
		   int j= (int) stk.pop();
		   reverseStack(stk);
		   reverse(stk,j);
	   }
   }
   public void reverse(Stack<Integer> stk,int j) {
	   while(stk.isEmpty()) {
		   stk.push(j);
		   //System.out.println(j);
		   return;
	   }
	   int temp= stk.pop();
	   reverse(stk,j);
	   stk.push(temp);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Stack<Integer> st= new Stack<Integer>();
	   for(int i = 0;i< 10;i++) {
		   st.push(i);
	   }
       Stacks sts = new Stacks();
       System.out.println(st.toString());
       sts.reverseStack(st);
      System.out.println(st.toString());
	}

}

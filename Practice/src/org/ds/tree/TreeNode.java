package org.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Tree{
	Tree(int data){
		this.data= data;
	}	
	 int data;
	 Tree left;
	 Tree right;
 }

public class TreeNode {
	
	
	
	public ArrayList<Tree> postOrder(Tree root) {
		Stack<Tree> st= new Stack<Tree>();
		ArrayList<Tree> res= new ArrayList<Tree>();
		st.push(root);
		Tree prev= null;
		while(!st.isEmpty()) {
			Tree curr=st.peek();
			if(prev == null || prev.left== curr || prev.right==curr) {
				if(curr.left!=null)
					st.push(curr.left);
				else if (curr.right!= null) 
					st.push(curr.right);
			}else if (curr.left== prev) {
				if(curr.right!=null)
					st.push(curr.right);
			}else {
				//res.add(curr);
				System.out.println(curr.data);
				st.pop();
			}
			prev=curr;
		}
		return res;
	}
  public ArrayList<Integer> preOrder(Tree root){
	  ArrayList<Integer> res= new ArrayList<Integer>();
	  Stack<Tree> s= new Stack<Tree>();
	  s.push(root);
	  while(!s.isEmpty()) {
		  Tree temp= s.pop();
		  //res.add(temp.data);
		  System.out.println(temp.data);
		  if(temp.right!=null)
			  s.push(temp.right);
		  if(temp.left!= null)
			  s.push(temp.left);		  
	  }
	  return res;
  }
  public void levelOrder(Tree root) {
	  Queue<Tree> q= new LinkedList<Tree>();	  
	  q.offer(root);
	  int length= 1;
	  q.offer(null);
	  while(!q.isEmpty())
	  {
		  Tree curr=q.poll();		  
		  if(curr==null && !q.isEmpty()) {
			  q.offer(null);
			  System.out.println();
		  }
		  if(curr!=null) {
			  if(curr.left!= null)
				  q.offer(curr.left);
			  if(curr.right!= null)
				  q.offer(curr.right);
			  System.out.println(curr.data);
		  }
	  }
	  
  }
  
  public int maxTree(Tree root) {
	  int max=0;
	  if(root==null)
		  return 0;
	  while(root!= null) {
		  max=root.data;
		  int leftmax= maxTree(root.left);
		  int rightmax= maxTree(root.right);
		  if(leftmax>max) 
			  max= leftmax;
		  if(rightmax>max) 
			  max= rightmax;		  		 
	  }	  
	  return max;
  }
  public int size(Tree root) {
	  int left= root.left==null?0:size(root.left);
	  int right= root.right==null?0:size(root.right);
	  return 1+left+right;
  }
	public static void main(String[] args) {
		Tree root=new Tree(1);
		root.left=new Tree(2);
		root.right= new Tree(3);
		root.left.left=new Tree(4);
		root.right.left= new Tree(6);
		root.left.right=new Tree(5);
		//root.right.right= new Tree(7);
		new TreeNode().levelOrder(root);	
		//System.out.println(new TreeNode().size(root));
	}
}

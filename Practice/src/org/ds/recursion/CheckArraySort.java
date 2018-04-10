package org.ds.recursion;

public class CheckArraySort {

	int sorted(int[] a,int index) {
		if(index ==1)
			return 1;
		return((a[index-1]< a[index-2])?0:sorted(a,index-1));
	}
	public static void main(String[] args) {
		CheckArraySort arr = new CheckArraySort();
		System.out.println(arr.sorted(new int[] {1,2,3,4,5,6},5));

	}

}

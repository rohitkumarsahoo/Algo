package org.ds.sort;

import java.util.Arrays;

public class Sorting {
	
	public int[] bubble(int[]a) {
		int temp;
		for(int i = 0;i<a.length;i++) {
			for(int j=i;j<a.length-1;j++) {
				if (a[j]>a[j+1]) {
					temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}				
		}return a;
	}
	public int[] selection(int[] a) {
		for(int i = 0;i<a.length;i++) {
			int min=i,temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j])
					min=j;
			}
			temp= a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		return a;
	}
    public int [] insertion(int[] a ) {
    	int i,j,k;
    	for(i=2;i<a.length;i++) {
    		j=i;
    		k=a[i];
    		while((a[j-1]>k)&& j>0) {
    			a[j]=a[j-1];
    			j--;
    		}
    		a[j]=k;
    	}return a;
    }
    public void mergeSort(int[] a ,int [] temp,int left,int right) {
    	int mid;
    	if (left<right) {
    		mid= (left + right)/2;
    		mergeSort(a,temp,left,mid);
    		mergeSort(a,temp,mid+1,right);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(new Sorting().insertion(a)));

	}

}

package org.ds.tree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Tester {
	
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
	
    static int[] rearrange(int[] elements) {
    	
    	int [] counts= new int[elements.length];
    	
    	for(int i=0;i<elements.length;i++)
    	{
    		int no= elements[i];
    		int count=0;
    		for (count = 0; no > 0; ++count) {
    	  	      no &= no - 1;
    	  	    }
    		counts[i]=count;
    	}
    	for (int i = 0; i < counts.length; i++) {
    	    for (int j = 0; j < counts.length; j++) {
    	        if (counts[i] < counts[j]||((counts[i]== counts[j])&&(elements[i]<elements[j]))) {
    	            int temp = counts[i];
    	            counts[i] = counts[j];
    	            counts[j] = temp;
    	             temp = elements[i];
    	            elements[i] = elements[j];
    	            elements[j] = temp;
    	            
    	        }
    	    }
    	    System.out.println(Arrays.toString(elements));
    	}
    	return elements;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }
        
        // call rearrange function
        int[] results = rearrange(elements);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}
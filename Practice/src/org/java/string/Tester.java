package org.java.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Compute implements Comparable<Compute>
{
	int decNo;
	int countof1;
	
	public Compute(int decNo,int countof1) {
		this.decNo = decNo;
		this.countof1 = countof1;
	}

	@Override
	public int compareTo(Compute o) {
		if(countof1 == o.countof1)
		{
			if(decNo > o.decNo)
			{
				return 1;
			}
			else
				return -1;
		}
		
		if(countof1 > o.countof1)
			return 1;
		else
			return -1;
		
	}

}

public class Tester {
	
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
	static int count(int no)
	{
		int count=0;
		for (count = 0; no > 0; ++count) {
  	      no &= no - 1;
  	    }
		return count;
	}
    static int[] rearrange(int[] elements) {
    	
    	ArrayList<Compute> al = new ArrayList<>();
    	for (int element : elements) {
			
    		al.add(new Compute(element, count(element)));
		}
    	Collections.sort(al);
    	for(int i=0;i<elements.length;i++)
    	{
    		elements[i] = al.get(i).decNo;
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
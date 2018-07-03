package org.java.string;

public class LongestPalindrom {
	public static void longest(String str) {
		int i,j;
		for(int mid=1;mid<str.length();mid++) {
			i=mid-1;
			j=mid+1;
			while(i>=0 && j<str.length()) {
				if (str.charAt(i)!=str.charAt(j))
					break;
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.substring(i, j+1));
					i--;
					j++;
				}
					
			}
		}
			
	}

	public static void main(String[] args) {
		
        longest("1234543");
	}

}

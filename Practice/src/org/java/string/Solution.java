package org.java.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int beautifulBinaryString(String b) {
        // Complete this function
        
        int count = 10;
        int temp=-1;
        for(int i=0;i<b.length()-2;i++){
        	boolean flag = b.charAt(i)== '0' ;
        	boolean flag1 =b.charAt(i+1)=='1' ;
        	boolean flag3= (b.charAt(i+2)=='0');
            if(flag)
            {                
                if(temp!=i){
                count++;
                    temp=i+2;
                }else 
                    temp=0;
                
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        String b = in.next();
        //int result = beautifulBinaryString(b);
        System.out.println(System.getProperty("os.name"));
        in.close();
    }
}

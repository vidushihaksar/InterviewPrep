/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		
		for(int t = 0; t <T; t++){
		    int n = scn.nextInt();
		    int[]a = new int[n];
		    for(int e=0; e < n; e++){
		        a[e] = scn.nextInt();
		    }
		    
		    helper(a);
		    
		    StringBuilder sb = new StringBuilder();
		    for(int ele : a){
		        sb.append(ele+" ");
		    }
		    System.out.println(sb);
		}
		
	}
	
	public static void helper(int[]a){
	    int i =0, j=0;
	    while(j < a.length){
	        if(a[j] == 1) { j++; }
	        else{
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	            i++;
	            j++;
	        }
	    }
	}
}
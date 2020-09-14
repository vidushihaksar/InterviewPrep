sb.append(i)
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
      	int T = scn.nextInt();
      	for(int t = 0; t < T; t++){
      	    int n = scn.nextInt();
      	    helper(n);
      	}
	}
	
	public static void helper(int n){
	    boolean[] chkPrime = new boolean[n+1];
	    
	    for(int i =0; i< chkPrime.length; i++){
	        chkPrime[i] = true;   //considering all nos are prime
 	    }
 	    
 	    for(int i =2; i*i <= n ; i++){  // i=2 bcus 0,1 are neither prime nor composite
 	        
 	        if(chkPrime[i]){
 	            
 	            for(int j = i*i; j<= n; j += i){
 	                chkPrime[j] = false;
 	            }
 	        }
 	    }
 	    
 	    StringBuilder sb = new StringBuilder();
 	    //atlast print all primes nos 
 	    for(int i = 2; i <= n; i++){
 	        if(chkPrime[i]){
 	            sb.append(i+" ");
 	        }
 	        
 	    }
 	    
 	    System.out.println(sb);
 	    
 	    
	}
}
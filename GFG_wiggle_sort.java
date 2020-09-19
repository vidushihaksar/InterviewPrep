import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		
		for(int t = 0; t <T; t++){
		
		    int n = scn.nextInt();
		    int[]arr = new int[n];
		    for(int i=0; i < n; i++){
		        arr[i] = scn.nextInt();
		    }
		    WiggleSort(arr);
		}
	}
	
	public static void WiggleSort(int[]arr){
	    
	    for(int i =0; i< arr.length-1; i++){
	        
	        if(i % 2 == 0){    //for even index a[i] >= a[i+1]
	            if(arr[i] < arr[i+1]){  
	                int tmp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = tmp;
	            }
	        }else{             //for odd index a[i] <= a[i+1]
	            if(arr[i] > arr[i+1]){
	                int tmp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = tmp;
	            }
	        }
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    for(int i=0; i<arr.length;i++){
	        sb.append(arr[i]+" ");
	    }
	    
	    System.out.println(sb);
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		
         
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		
		for(int t = 0; t <T; t++){
		
		    int n = scn.nextInt();
		    int[]arr = new int[n];
		    for(int i=0; i < n; i++){
		        arr[i] = scn.nextInt();
		    }
		    
		    int[]dep = new int[n];
		    for(int i=0; i < n; i++){
		        dep[i] = scn.nextInt();
		    }
		    
		    helper(arr, dep);
		}
	}
	
	public static void helper(int[]arrv, int[]dept){
	    Arrays.sort(arrv);
	    Arrays.sort(dept);
	    
	    int currPlat =0;
	    int overallPlat = 0;
	    int i = 0, j=0;
	    
	    while(i < arrv.length ){
	        if(arrv[i] <= dept[j]){
	            currPlat++;
	            overallPlat = Math.max(overallPlat, currPlat);
	            i++;
	        }else {
	            currPlat--;
	            j++;
	        }
	    }
	    System.out.println(overallPlat);
	}
}
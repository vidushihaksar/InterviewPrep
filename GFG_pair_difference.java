/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
      	int T = scn.nextInt();
      	for(int t = 0; t < T; t++){
      	    int n = scn.nextInt();
      	    int tar = scn.nextInt();
      	    int[] a= new int[n];
      	    for(int i=0; i<n;i++){
      	        a[i] = scn.nextInt();
      	    }
      	    System.out.println(hasArrayTwoCandidates(a, tar));
      	}
	}
	
	static int hasArrayTwoCandidates(int arr[], int x) {
        Arrays.sort(arr);
        int i=0, j =0;
        
        while(i < arr.length && j < arr.length){
            if(arr[j] - arr[i] == x){
                return 1;
            }else if(arr[j] - arr[i] < x){
                j++;
            }else if(arr[j] - arr[i] > x){
                i++;
            }
        }
        return -1;
    }
}
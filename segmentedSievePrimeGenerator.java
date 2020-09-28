import java.util.*;
import java.lang.*;
 
 class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
      	int T = scn.nextInt();
      	for(int t = 0; t < T; t++){
      	    int m = scn.nextInt();
      	    int n= scn.nextInt();
      	    helper(m,n);
      	}
	}
	
	public static void helper(int m, int n){
		List<Integer> list = new ArrayList<>();
		normalSieve((int)Math.sqrt(n), list);
		boolean[] a = new boolean[n-m+1];
		
		for(int i =0; i< a.length; i++){
	        a[i] = true;   //considering all nos are prime
 	    }
 	    
 	    
		for(int i =0; i< list.size(); i++){
			int num = list.get(i);
			//System.out.println(list.size());
			double divide = (double)m/num;
			int firstMultiple = (int)Math.ceil(divide)*num-m ;
			//System.out.println(firstMultiple);
			for(int j = firstMultiple; j < a.length ; j += num){
				if(j+m != num)
			       	a[j] =false;
			}
		}
		
		StringBuilder sb = new StringBuilder();
 		for(int i =0; i < a.length; i++){
              // System.out.print(a[i] +" ");
             if(a[i] && i+m != 1){
                 
		       	sb.append((i+m)+"\n");
             }
            
		}
		System.out.println(sb);
	}
	
	public static void normalSieve(int n, List<Integer> list){
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
 	    
 	    //atlast print all primes nos 
 	    for(int i = 2; i <= n; i++){
 	        if(chkPrime[i]){
 	            list.add(i);
 	        }
 	        
 	    }
	}
	
}
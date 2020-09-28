class Solution {
    public int[] sortedSquares(int[] A) {
        int i =0;
        int j = A.length-1;
        int k = A.length-1;
        int[] ans =new int[A.length];
        
        while(i <= j){
            int sq1 = A[i]*A[i];
            int sq2 = A[j]*A[j];
            
            ans[k] = Math.max(sq1, sq2);
            k--;
            
            if(sq1 < sq2) j--;
            else i++;
        }
        return ans;
    }
}
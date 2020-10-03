class Solution {
    public int partitionDisjoint(int[] A) {
        
        int left_max = A[0];
        int overall_max = A[0];
        int ansidx = 0;
        
        for(int i =1; i< A.length; i++){
            if(A[i] >= left_max){
                overall_max = Math.max(overall_max, A[i]);
            }else{
                ansidx = i;
                left_max = overall_max;
            }
        }
        return ansidx +1;
    }
}
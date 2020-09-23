class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int a_of_0 = A[0];
        int b_of_0 = B[0];
        
        int aOfi_aOf0_hai_kya = 0;
        int aOfi_bOf0_hai_kya = 0;
        int bOfi_aOf0_hai_kya = 0;
        int bOfi_bOf0_hai_kya = 0;
        
        for(int i=0; i< A.length; i++){
            if(A[i] != a_of_0 && aOfi_aOf0_hai_kya != (int)1e8){
                if(B[i] == a_of_0){
                    aOfi_aOf0_hai_kya++;   //swap se ajyega
                }else{
                    aOfi_aOf0_hai_kya = (int)1e8;
                }
            
            }
            if(A[i] != b_of_0 && aOfi_bOf0_hai_kya != (int)1e8){
                if(B[i] == b_of_0){
                    aOfi_bOf0_hai_kya++;
                }else{
                    aOfi_bOf0_hai_kya = (int)1e8;
                }
            
            }
            if(B[i] != a_of_0 && bOfi_aOf0_hai_kya != (int)1e8){
                if(A[i] == a_of_0){
                    bOfi_aOf0_hai_kya++;
                }else{
                    bOfi_aOf0_hai_kya = (int)1e8;
                }
           
            }
            if(B[i] != b_of_0 && bOfi_bOf0_hai_kya != (int)1e8){
                if(A[i] == b_of_0){
                    bOfi_bOf0_hai_kya++;
                }else{
                    bOfi_bOf0_hai_kya = (int)1e8;
                }
            }
        }
        if(aOfi_aOf0_hai_kya == (int)1e8 &&  aOfi_bOf0_hai_kya == (int)1e8 && bOfi_aOf0_hai_kya == (int)1e8 && bOfi_bOf0_hai_kya == (int)1e8){
            return -1;
        }
            
        return Math.min(Math.min(aOfi_aOf0_hai_kya,aOfi_bOf0_hai_kya), Math.min(bOfi_aOf0_hai_kya, bOfi_bOf0_hai_kya));
    }
}
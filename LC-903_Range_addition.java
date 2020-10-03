public class Solution {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        // Write your code here
        int[] arr = new int[length];
        for(int r = 0; r < updates.length; r++){
            int si = updates[r][0];
            int ei = updates[r][1];
            
            arr[si] += updates[r][2];
            if(ei + 1 < length) arr[ei+1] += -updates[r][2];
        }
        for(int i =0 ; i < length; i++){
            System.out.print(arr[i]+" ");
            
        }
        
        for(int i =1 ; i < length; i++){
            arr[i] = arr[i-1]+arr[i];
        }
        
        return arr;
    }
}
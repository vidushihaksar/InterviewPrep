class Solution {
    public int maxArea(int[] height) {
        int i =0, j= height.length-1;
        int maxA = 0;
        while(i < j){
            int h = Math.min(height[i], height[j]);
            int w = j-i;
            maxA = Math.max(maxA,h*w);
            
            if(height[i] <  height[j]) i++;
            else j--;
           
        }
        
        return maxA;
    }
}
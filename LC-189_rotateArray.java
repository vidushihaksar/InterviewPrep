class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k%n;
        if(n <=1 || k == n)return ;
        
        if(n-k >=0) reverse(n-k, n-1, nums);
        if(n-k-1 >= 0) reverse(0, n-k-1, nums);
        reverse(0 , n-1, nums);
        
        
    }
    
    public void reverse(int i, int j, int[] nums){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        if(nums.length == 0) return ans;
        helper(ans, nums);
        return ans;
    }
    
    public void helper(List<Integer> ans , int[]nums){
        int val1 = nums[0];
        int count1 =1;
        int val2 = -1;
        int count2 = 0;
        
        for(int i =1; i< nums.length; i++){
            
            if(nums[i] == val1) count1++;
            else if(nums[i] == val2) count2++;
            else if(count1 == 0){
                val1 = nums[i];
                count1 =1;
            }
            else if(count2 == 0){
                val2 = nums[i];
                count2 =1;
            }
            else{
                count1--;
                count2--;
            }
            
        }
        
        
        int n1 =0;
        int n2 =0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] == val1 ) n1++;
            else if(nums[i] == val2) n2++;
        }
        
        if(n1 > nums.length/3 ){
            ans.add(val1);
        }
        if(n2 > nums.length/3 ){
            ans.add(val2);
        }
        
    }
}
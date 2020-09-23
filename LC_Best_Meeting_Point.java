public class Solution {
    
    public int minTotalDistance(int[][] grid) {
        // Write your code here
        
        List<Integer> row = new ArrayList<>();
        for(int i =0; i< grid.length; i++){
            
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j] == 1) row.add(i);
            }
            
        }
        
        List<Integer> col = new ArrayList<>();
        for(int j =0; j< grid[0].length; j++){
            
            for(int i=0; i< grid.length; i++){
                if(grid[i][j] == 1) col.add(j);
            }
            
        }
        
        int dest_i = row.get(row.size()/2);
        int dest_j = col.get(col.size()/2);
        System.out.println(dest_i+" "+dest_j );
        int ans = 0;
        for(int i =0; i< row.size(); i++){
            ans += Math.abs(row.get(i) - dest_i) + Math.abs(col.get(i) - dest_j);
        }
        
        return ans;
    }
}
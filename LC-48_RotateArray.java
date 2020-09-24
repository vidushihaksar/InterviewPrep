class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i =0; i< matrix.length; i++){     
            for(int j= 0; j< i; j++){
                int ele = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = ele;
            }
        }
        
        int i =0,j = matrix[0].length-1;
        while(i < j){
            
            for(int r = 0; r < matrix.length; r++){
                int ele = matrix[r][i];
                matrix[r][i] = matrix[r][j];
                matrix[r][j] = ele;
            }
            i++;
            j--;
        }
    }
}
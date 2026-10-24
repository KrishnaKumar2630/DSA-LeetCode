class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
       int high = n-1;
       int i =0;
       
       while(high>=0 && i<m)
       {
        if(matrix[i][high]==target)
        return true ;
        else if(matrix[i][high]>target)
        {
            high--;
        }
        else
        {
          i++;
        }
       }
       return false ;
        
    }
}
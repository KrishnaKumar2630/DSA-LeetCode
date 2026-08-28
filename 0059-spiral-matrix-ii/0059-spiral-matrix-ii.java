class Solution {
    public int[][] generateMatrix(int n) {
    int matrix[][]=new int[n][n];
    int rowBegin = 0;
    int rowEnd = matrix.length - 1;
    int colBegin = 0;
    int colEnd = matrix[0].length - 1;  
     ArrayList<Integer> list = new ArrayList<>();
     for(int i= 1;i<=n*n;i++)
     {
        list.add(i);
     }
     int i =0;
    while (rowBegin <= rowEnd && colBegin <= colEnd) {
      // Traverse Right
      for (int j = colBegin; j <= colEnd; j++) {
        matrix[rowBegin][j]= list.get(i);
        i++;
      }

      rowBegin++;

      // Traverse Down
      for (int j = rowBegin; j <= rowEnd; j++) {
         matrix[j][colEnd]=list.get(i);
         i++;
      }
      colEnd--;

      if (rowBegin <= rowEnd) {
        // Traverse Left
        for (int j = colEnd; j >= colBegin; j--) {
         matrix[rowEnd][j]=list.get(i);
         i++;
        }
      }
      rowEnd--;

      if (colBegin <= colEnd) {
        // Traverse Up
        for (int j = rowEnd; j >= rowBegin; j--) {
         matrix[j][colBegin]=list.get(i);
         i++;
        }
      }
      colBegin++;
    }
    return matrix;
    }
} 
    
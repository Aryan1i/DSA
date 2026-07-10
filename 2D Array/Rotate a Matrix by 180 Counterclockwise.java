//Problem
    
    /*Given a 2D square matrix mat[][] of size n x n, rotate it by 180 degrees without using extra space.
    
    Note: You must rotate the matrix in place and modify the input matrix directly.
    
    Examples:
    
    Input:  mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    Output: [[9, 8, 7], [6, 5, 4], [3, 2, 1]]
    Explanation:
    
    The output matrix is the input matrix rotated by 180 degress.
     
    
    Input: mat[][] = [[1, 2], [3, 4]]
    Output: [[4, 3], [2, 1]]
    Explanation : The output matrix is the input matrix rotated by 180 degrees.
    Constraints:
    1 ≤ n ≤ 500
    0 ≤ mat[i][j] ≤ 104
    
    */

//Solution

class Solution {
    public void rotateMatrix(int[][] mat) {
        int n = mat.length;
        
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < n; j++){
                int temp = mat[n - (i + 1)][n - (j + 1)];
                mat[n - (i + 1)][n - (j + 1)] = mat[i][j];
                mat[i][j] = temp;
            }
        }
        
        if(n % 2 == 1){
            for(int i = 0; i < n/2; i++){
                int temp = mat[n/2][n - (i + 1)];
                mat[n/2][n - (i + 1)] = mat[n/2][i];
                mat[n/2][i] = temp;
            }
        }
    }
}

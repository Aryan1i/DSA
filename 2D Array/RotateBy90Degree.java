//Problem
    
    /*Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 
    
    Examples:
    
    Input: mat[][] = [[0, 1, 2], 
                    [3, 4, 5], 
                    [6, 7, 8]] 
    Output: [[2, 5, 8],
            [1, 4, 7],
            [0, 3, 6]]
    Input: mat[][] = [[1, 2],
                    [3, 4]]
    Output: [[2, 4],
            [1, 3]]
    Constraints:
    1 ≤ n ≤ 102
    0 ≤ mat[i][j] ≤ 103
    
    */

//Solution

class Solution {
    public void rotateMatrix(int[][] mat) {
        rotate(mat);
        transpose(mat);
    }
    
    public void transpose(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = i + 1; j < mat[0].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    
    public void rotate(int[][] mat){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = mat[i][n - j - 1];
                mat[i][n - j - 1] = mat[i][j];
                mat[i][j] = temp;
            }
        }
    }
}

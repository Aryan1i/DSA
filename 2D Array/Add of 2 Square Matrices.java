//Problem
    
    /*You are given two square matrices, a[][] and b[][], each of size n x n. Your task is to compute the sum of these two matrices and store the result in the matrix a[][] itself.
    
    Examples:
    
    Input: a[][] = [[1, 2], [3, 4]],
           b[][] = [[4, 3], [2, 1]]
    Output: [[5, 5], [5, 5]]
    Explanation: The will be: [[5, 5], [5, 5]] on adding the corresponding elements of both matrices.
    Input: a[][] = [[7, 8], [9, 10]],
           b[][] = [[1, 2], [3, 4]]
    Output: [[8, 10], [12, 14]]
    Explanation: The result will be [[8, 10], [12, 14]] after adding the corresponding elements of both matrices. 
    Constraints:
    1 <= n <= 100*/

//Solution

class Solution {
    public void addMat(int[][] a, int[][] b) {
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] += b[i][j];
            }
        }
    }
}

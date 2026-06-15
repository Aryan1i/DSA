//Prblem

    /*Given a square matrix of size n×n. Your task is to calculate the sum of its diagonals.
    
    Note :  When n is odd, there is center value which is counted twice in the diagonal sum.
    
    Examples:
    
    Input: mat[][] = [[1, 0, 1], [0, 1, 0], [1, 0, 1]]
    
    Output: 6
    Input: mat[][] = [[1, 2], [3, 4]]
     
    Output: 10
    Constraints:
    1 ≤ n ≤ 100
    1 ≤ mat[i][j] ≤ 10000*/

//Solution

class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int ans = 0;
        
        for(int i = 0,j = matrix.length - 1; i < matrix.length; i++, j--){
            ans += matrix[i][i];
            ans += matrix[i][j];
        }
        
        return ans;
    }
}

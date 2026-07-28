//Problem

    /*Given a 2D integer array mat[][] of size n × m, check whether for every index i, the sum of the ith row is equal to the sum of the ith column. Return true if the condition holds for all valid indices, otherwise return false.
    
    Note: If the matrix is not square (n != m), only compare indices up to min(n, m). For example, if there are 3 rows and 1 column, only compare the 1st row with the 1st column.
    
    Examples:
    
    Input: mat[][] = [[1, 2], [2, 1]]
    Output: true
    Explanation: Sum of 1st row = 1 + 2 = 3, and Sum of 1st column = 1 + 2 = 3. Similarly, Sum of 2nd row = 2 + 1 = 3, and Sum of 2nd column = 2 + 1 = 3. All corresponding row and column sums are equal.
    Input: mat[][] = [[5], [0], [0]]
    Output: true
    Explanation: Only the first row and first column are considered. The sum of the first row is 5, and the sum of the first column is also 5. Both values are equal.
    Input: mat[][] = [[1, 4, 2], [6, 1, 3]]
    Output: false 
    Explaination: Sum of the first row and first column are equal, but the sum of the second row is 10 which is not equal to the sum of the second column which is 5.
    Constraints:
    1 ≤ n, m ≤ 103   
    0 ≤ mat[i][j] ≤ 103 */

//Solution

class Solution {
    public boolean sumOfRowCol(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i = 0; i < Math.min(n, m); i++){
            if(row(i, n, mat) != col(i, m, mat)) return false;
        }
        
        return true;
    }
    
    public long row(int r, int n, int[][] mat) {
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += mat[i][r];
        }
        return sum;
    }
    
    public long col(int c, int m, int[][] mat){
        long sum = 0;
        for(int i = 0; i < m; i++){
            sum += mat[c][i];
        }
        return sum;
    }
}

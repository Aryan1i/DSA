//Problem

    /*Given a matrix of size n x m, reverse the order of its columns in-place so that the last column becomes the first, the second-last becomes the second, and so on.
    
    Examples:
    
    Input: n = 4, m = 3, matrix[][] = [[1, 2, 3], [5, 6, 7], [11, 10, 9], [13, 14, 15]]
    Output: [[3, 2, 1], [7, 6, 5], [9, 10, 11], [15, 14, 13]]
    Explanation: Array after exchanging columns:
                  [[3, 2, 1],
                   [7, 6, 5],
                   [9, 10, 11],
                   [15, 14, 13]]
    Input: n = 2, m = 5, matrix[][] = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]
    Output: [[5, 4, 3, 2, 1], [10, 9, 8, 7, 6]]
    Explanation: After reversing the column of matrix
                    [[5, 4, 3, 2, 1]
                     [10, 9, 8, 7, 6]]
    Constraints:
    1 ≤ n, m ≤ 100
    0 ≤ matrix[i][j] ≤ 1000
    
    */

//Solution

class Solution {
    // Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - (j + 1)];
                matrix[i][m - (j + 1)] = temp;
            }
        }
    }
}

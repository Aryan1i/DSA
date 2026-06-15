//Problem

    /*Given a non-null integer matrix mat[][] of size n × m, compute the sum of all its elements.
    
    Examples:
    
    Input: mat[][] = [[1, 0, 1],
                    [-8, 9, -2]]
    Output: 1
    Explanation: The sum of all elements of the matrix is: (1 + 0 + 1 - 8 + 9 - 2) = 1.
    Input: mat[][] = [[1, 0, 1, 0, 1],
                    [0, 1, 0, 1, 0],
                   [-1, -1, -1, -1, -1]]
    Output: 0
    Explanation: The sum of all elements of the matrix is: (1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 - 1 - 1 - 1 - 1 - 1) = 0.
    Constraints:
    1 ≤ n, m ≤ 103
    -103 ≤ mat[i][j] ≤ 103*/

//Solution

class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                sum += Grid[i][j];
            }
        }
        
        return sum;
    }
}

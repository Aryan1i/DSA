//Problem
    
    /*Given a binary matrix mat[][] of size n × m containing values 0 and 1, and four integers xs, ys, xd, and yd representing the source cell (xs, ys) and destination cell (xd, yd), find the length of the longest possible path from the source cell to the destination cell. From any cell, you can move to its adjacent cells in the up, down, left, and right directions.
    
    1 represents a traversable cell.
    0 represents a blocked cell that cannot be visited.
    A cell can be visited at most once in a path.
    If the destination cannot be reached from the source, return -1.
    Examples:
    
    Input: mat[][] = [[1, 1, 1, 1, 1, 1, 1, 1, 1, 1], [1, 1, 0, 1, 1, 0, 1, 1, 0, 1],[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]], xs = 0, ys = 0, xd = 1, yd = 7
    Output: 24 
    Explanation: The longest valid path from (0, 0) to (1, 7) without revisiting any cell has length 24. 
    
    Input: mat[][] = [[1, 0, 0, 1, 0],[0, 0, 0, 1, 0],[0, 1, 1, 0, 0]], xs = 0, ys = 3, xd = 2, yd = 2
    Output: -1
    Explanation: The destination cell (2, 2) cannot be reached from the source cell (0, 3), so the answer is -1.
     
    Constraints:
    1 ≤ n, m ≤ 10
    mat[i][j] == 0 or mat[i][j] == 1
    The source and destination cells are always inside the matrix.
    
    */

//Solution

class Solution {
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        solve(xs, ys, 0, mat, xd, yd);
        return ans;
    }
    
    int ans = -1;
    public void solve(int i, int j,int r, int[][] mat, int xd, int yd){
        int m = mat.length;
        int n = mat[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n || mat[i][j] == 0){
            return;
        }
        
        if(i == xd && j == yd) {
            ans = Math.max(ans, r);
            return;
        }
        
        mat[i][j] = 0;
        
        solve(i - 1, j, r + 1, mat, xd, yd);
        solve(i, j + 1, r + 1, mat, xd, yd);
        solve(i + 1, j, r + 1, mat, xd, yd);
        solve(i, j - 1, r + 1, mat, xd, yd);
        
        mat[i][j] = 1;
    }
}

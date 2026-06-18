//Problem

    /*Given a matrix mat[][] and a number k, find the k-th element obtained while traversing the matrix in spiral order.
    
    Note: Spiral traversal follows a pattern where we move left to right on the top row, top to bottom on the last column, right to left on the bottom row, and bottom to top on the first column, repeating this process for the inner layers until all elements are visited.
    
    Examples:
    
    Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 10
    Output: 13
    Explanation:
     
    The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13. 
    Input: mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]], k = 4
    Output: 6
    Explanation: The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.
    Constraints:
    1<=n,m<=103
    1<=k<=n*m
    -109 <= A[i][j] <= 109*/

//Solution

class Solution {
    public int findK(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        
        int idx = 0;
        
        while(left <= right && top <= bottom){
            for(int x = left; x <= right; x++){
                if(++idx== k) return mat[top][x];
            }
            top++;
            
            for(int x = top; x <= bottom ; x++){
                if(++idx== k) return mat[x][right];
            }
            right--;
            
            if (top <= bottom) {
                for (int x = right; x >= left; x--) {
                    if (++idx == k) return mat[bottom][x];
                }
                bottom--;
            }

            if (left <= right) {
                for (int x = bottom; x >= top; x--) {
                    if (++idx == k) return mat[x][left];
                }
                left++;
            }
        }
        
        return 0;
    }
}

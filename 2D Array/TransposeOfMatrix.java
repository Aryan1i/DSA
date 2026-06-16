//Problem

    /*Given a square matrix of size n x n, return the transpose matrix of the given matrix.
    
    The transpose of a matrix is obtained by converting all the rows to columns and all the columns to rows.
    
    Examples:
    
    Input: mat[][] = [[1, 1, 1, 1],
                     [2, 2, 2, 2],
                     [3, 3, 3, 3],
                     [4, 4, 4, 4]]
    Output: [[1, 2, 3, 4],
            [1, 2, 3, 4],
            [1, 2, 3, 4],
            [1, 2, 3, 4]]
    Explanation: Converting rows into columns and columns into rows.
    Input: mat[][] =  [[1, 2],
                      [9, -2]]
    Output: [[1, 9],
            [2, -2]]
    Explanation: Converting rows into columns and columns into rows.
    Constraints:
    1 ≤ n ≤ 103
    -109 ≤ mat[i][j] ≤109*/

//Solution


class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i< mat[0].length; i++){
            ans.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                int temp = mat[i][j];
                ans.get(j).add(temp);
            }
        }
        
        return ans;
    }
}

//Problem
    
    /*Given a n*n matrix mat[][] , check whether the matrix is a magic square or not.
    A Magic Square is a n x n matrix of distinct elements from 1 to n * n where the sum of any row, column, or diagonal is always equal. 
    
    Examples:
    
    Input: mat[][] = [[2, 7, 6], 
                     [9, 5, 1], 
                     [4, 3, 8]]
    Output: true
    Explanation: Sum of rows, columns, and diagonals are all equal to 15. 
    Input: mat[][] = [[1, 2], 
                     [3, 4]]
    Output: false
    Explanation: Sum of all rows and columns are not same.
    Input: mat[][] = [[1, 1, 1], 
                     [1, 1, 1],
                     [1, 1, 1]]
    Output: false
    Explanation: All sums are same but all elements from 1 to n2 are not present.
    Constraints: 
    1 ≤ n ≤ 103*/

//Solution

class Solution {
    public boolean magicSquare(int[][] mat) {
        boolean x = check(mat);
        if(!x) return false;
        
        tras(mat);
        
        boolean y = check(mat);
        if(!y) return false;
        
        return true;
        
    }
    
    public void tras(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = i + 1; j < mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    
    public boolean check(int[][] mat){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[0][i];
            set.add(mat[0][i]);
        }
        
        for(int i = 1; i < mat.length; i++){
            int temp = 0;
            for(int j = 0; j < mat.length; j++){
                temp += mat[i][j];
                set.add(mat[i][j]);
            }   
            if(temp != sum) return false;
        }
        
        if(set.size() != mat.length * mat.length) return false;
        
        return true;
    }
    
    
}

//Problem
    
    /*You are given a matrix mat[][] of size n*m containing english alphabets and a string word. Check if the word exists on the mat[][] or not.
    
    The word can be constructed by using letters from adjacent cells, either horizontally or vertically.
    The same cell cannot be used more than once.
    Examples :
    
    Input: mat[][] = [['T', 'E', 'E'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"
    Output: true
    Explanation: Word "GEEK" can be found in the given grid as follows.
    
    Input: mat[][] = [['T', 'E', 'U'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"
    Output: false
    Explanation: Word "GEEK" cannot be found in the given grid.
    
    Input: mat[][] = [['A', 'B', 'A'], ['B', 'A', 'B']], word = "AB"
    Output: true
    Explanation: There are multiple ways to construct the word "AB".
    
    Constraints:
    1 ≤ n, m ≤ 6
    1 ≤ word.size() ≤ 15
    mat[] and word contain bot lower case and uppercase English characters
    
    */

//Solution

class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                if(mat[i][j] == word.charAt(0)){
                    if(valid(i, j, 0, word,mat, visited)) return true;
                }
            }
        }
        return false;
    }
    
    public boolean valid(int i,int j, int idx, String word,char[][] mat, boolean[][] visited){
        if(i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || visited[i][j] == true || mat[i][j] != word.charAt(idx)) return false;
        
        if(idx == word.length() - 1) return true;
        visited[i][j] = true;
        
        if(valid(i - 1, j, idx + 1, word, mat, visited)) return true;
        if(valid(i , j + 1, idx + 1, word, mat, visited)) return true;
        if(valid(i + 1, j, idx + 1, word, mat, visited)) return true;
        if(valid(i , j - 1, idx + 1, word, mat, visited)) return true;
        
        visited[i][j] = false;
        
        return false;
    }
}

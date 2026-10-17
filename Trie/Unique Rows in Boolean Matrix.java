//Problem
    
    /*Given a binary matrix your task is to find all unique rows of the given matrix in the order of their appearance in the matrix.
    
    Examples:
    
    Input: mat[][] = [[1 1 0 1], 
                    [1 0 0 1],
                    [1 1 0 1]]
    Output: [[1 1 0 1],
            [1 0 0 1]]
    Explanation:
    The two unique rows are R1: [1 1 0 1] and R2: [1 0 0 1]. 
    As R1 first appeared at row-0 and R2 appeared at row-1, in the resulting list, R1 is kept before R2.
    Input: mat[][] = [[0 0 0 1],
                    [0 0 0 1]]
    Output: [0 0 0 1]
    Explanation: 
    Only unique row is [0 0 0 1].
    Constraints:
    
    1 ≤ n, m ≤ 40
    0 ≤ mat[i][j] ≤ 1*/

//Solution

class Solution {
    class Trie{
        Trie[] children = new Trie[2];
        boolean isEnd;
    }
    
    public ArrayList<ArrayList<Integer>> uniqueRow(int[][] mat) {
        int n = mat.length;;
        int m = mat[0].length;
        
        Trie root = new Trie();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    
        for(int i = 0; i < n; i++){
            Trie curr = root;
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < m; j++){
                if(curr.children[mat[i][j]] == null){
                    curr.children[mat[i][j]] = new Trie();
                } 
                curr = curr.children[mat[i][j]];
                list.add(mat[i][j]);
            }
            
            if(!curr.isEnd) ans.add(list);
            curr.isEnd = true;
        }
        
        return ans;
    }
}

//Problem

/*Given a boolean matrix mat[][], where each element is either 0 or 1, identify all rows that are duplicates of a previously occurring row. 

Return the 0-based indices of such rows in the order they occur.

Examples:

Input: mat[][] = [[1, 0],
                [1, 0]]
Output: [1]
Explanation: Row 1 is duplicate of Row 0.
Input: mat[][] = [[1, 0, 0],
                [1, 0, 0],
                [0, 0, 0],
                [0, 0, 0]]
Output: [1, 3]
Explanation: Row 1 and Row 3 are duplicates of Row 0 and 2 respectively.
Input: mat[][] = [[1, 1],
                [0, 0],
                [0, 0],
                [1, 1],
                [1, 1]]
Output: [2, 3, 4]
Explanation: Row 2 is a duplicate of row 1, and rows 3 and 4 are duplicates of row 0.
Constraints:

1 ≤ mat.size(), mat[i].size() ≤ 103
0 ≤ mat[i][j] ≤ 1*/

//Solution

class Solution {
    class Trie{
        Trie[] children = new Trie[2];
        boolean isEnd;
    }
    public ArrayList<Integer> repeatedRows(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        Trie root = new Trie();
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Trie curr = root;
            
            for(int j = 0; j < m; j++){
                if(curr.children[mat[i][j]] == null){
                    curr.children[mat[i][j]] = new Trie();
                }
                curr = curr.children[mat[i][j]];
            }
            
            if(curr.isEnd) ans.add(i);
            else curr.isEnd = true;
        }
        
        return ans;
    }
}

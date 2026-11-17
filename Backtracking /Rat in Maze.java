//Problem
    
    /*Given a square binary matrix maze[][] containing values 0 and 1, find all possible paths for a rat to travel from the top-left cell to the bottom-right cell. The rat can move in four directions: up(U), down(D), left(L), and right(R).
    
    1 represents an open cell through which the rat can move.
    0 represents a blocked cell that cannot be traversed.
    The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of 'U', 'D', 'L', and 'R', representing the sequence of moves taken by the rat.
    
    Note: Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.
    
    Examples:
    
    Input: maze[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]
    Output: ["DDRDRR", "DRDDRR"]
    Explanation: There are two valid paths from the source cell (0, 0) to the destination cell (3, 3).
    
    Input: maze[][] = [[1, 0], [1, 0]]
    Output: []
    Explanation: No path exists as the destination cell (1, 1) is blocked.
    Constraints:
    
    2 ≤ mat.size() ≤ 5
    0 ≤ mat[i][j] ≤ 1
    mat[i].size() = mat.size()*/

//Solution

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        int m = maze[0].length;
        
        ArrayList<String> ans = new ArrayList<>();
        solve(0, 0 , maze, "", ans);
        Collections.sort(ans);
        return ans;
    }
    
    public void solve(int i , int j, int[][] maze,String s, ArrayList<String> ans){
        if(i < 0 || i >= maze.length || j < 0 || j >= maze[0].length || maze[i][j] == -1 || maze[i][j] == 0) {
            return;
        }
        
        if(i == maze.length - 1 && j == maze[0].length - 1){
            ans.add(s);
            return;
        }
        maze[i][j] = -1;
        solve(i - 1, j , maze, s+'U', ans);
        solve(i, j + 1, maze, s+'R', ans);
        solve(i + 1 , j , maze, s+'D', ans);
        solve(i , j - 1, maze, s+'L', ans);
        maze[i][j] = 1;
        
    }
}

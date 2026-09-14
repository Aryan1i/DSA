//Problem
    
    /*Given the root of a binary tree. Return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.
    
    Note: If the tree is empty, return an empty list.
    
    Examples :
    
    Input: root = [1, 2, 3, 4, 5, N, N] 
     
    Output:[1, 2, 4]
    Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.
    
    Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]
    
    Output: [1, 2, 4, 5]
    Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.
    
    Constraints:
    
    0 ≤ size of binary tree, node.data ≤ 105*/

//Solution

/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[height(root) + 1];
        
        solve(root, ans, visited, 1);
        
        return ans;
    }
    
    public void solve(Node root, ArrayList<Integer> ans, boolean[] visited, int level){
        if(root == null) return ;
        if(visited[level] == false){
            ans.add(root.data);
            visited[level] = true;
        }
        
        solve(root.left, ans, visited, level + 1);
        solve(root.right, ans, visited, level + 1);
    }
    
    public int height(Node root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh, rh) + 1;
    }
}

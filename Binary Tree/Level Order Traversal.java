//Problem
    
    /*Given the root of a Binary Tree, your task is to return its Level Order Traversal.
    
    Note: A level order traversal is a breadth-first search (BFS) of the tree. It visits nodes level by level, starting from the root, and processes all nodes from left to right within each level before moving to the next.
    
    Examples:
    
    Input: root = [1, 2, 3]
    
    Output: [1, 2, 3]
    Explanation: We start with the root node 1, so the first level of the traversal is [1]. Then we move to its children 2 and 3, which form the next level, giving the final output [1, 2, 3].
    Input: root = [10, 20, 30, 40, 50, N, N]
    
    Output: [10, 20, 30, 40, 50]
    Explanation: We begin with the root node 10, which forms the first level as [10]. Its children 20 and 30 make up the second level, and their children 40 and 50 form the third level, resulting in [10, 20, 30, 40, 50].
    Constraints:
    
    1 ≤ size of binary tree ≤ 3*104
    0 ≤ node.data ≤ 109*/

//Solution

/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Node> q = new ArrayDeque<>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                Node l = q.poll();
                ans.add(l.data);
                if(l.left != null) q.offer(l.left);
                if(l.right != null) q.offer(l.right);
            }
        }
        
        return ans;
    }
}

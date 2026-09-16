//Problem
    
    /*Given an array nodes[] of size n, where each element represents the value of a node in the level-order traversal of a complete binary tree, construct the complete binary tree and return its root node.
    
    Example:
    
    Input: nodes[] = [1, 2, 3, 4, 5, 6, 7]
    Output: 
    
    Explanation: We start from the root and fill the tree level by level. First 1 becomes the root, then 2 and 3 become its children, and then 4, 5, 6, 7 fill the next level from left to right.
    
    Input: nodes[] = [10, 20, 30, 40, 50]
    Output:
    
    Explanation: We start from the root and fill the tree level by level. 10 is the root, 20 and 30 are its children, and 40 and 50 are placed as the left and right children of 20.
    Constraints:
    
    1 ≤ n ≤ 103
    0 ≤ nodes[i] ≤ 106*/

//Solution

/*
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public Node buildTree(List<Integer> nodes) {
        int n = nodes.size();
        if(n == 0) return null;
        Node root = new Node(nodes.get(0));
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        int i = 1;
        
        while(i < n){
            Node curr = q.poll();
            
            curr.left = new Node(nodes.get(i++));
            q.offer(curr.left);
            
            if(i >= n) break;
            
            curr.right = new Node(nodes.get(i++));
            q.offer(curr.right);
        }
        
        return root;
    }
}

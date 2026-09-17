//Problem
    
    /*Given a Binary Tree of size n, your task is to return the count of all the non-leaf nodes of the given binary tree.
    
    Examples:
    
    Input: root[] = [1, 2, 3, 4, 5]
    
    Output: 2
    Explanation: Nodes 1 and 2 are the only non leaf nodes.
    Input: root[] = [10, 5, 20, 3, 7, 15, 25]
    
    Output: 3
    Explanation: Nodes 10, 5 and 20 are the only non leaf nodes.
    Input: root[] = [8, 3, 9, 1, 6, 4, 7]
    
    Output: 3
    Explanation: Nodes 8, 3 and 6 are the only non leaf nodes.
    Constraints:
    
    1 ≤ size of binary tree, node.data ≤ 105*/

//Solution

/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution {
    int countNonLeafNodes(Node root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        
        
        int l = countNonLeafNodes(root.left);
        int r = countNonLeafNodes(root.right);
        
        return l + r + 1;
    }
}

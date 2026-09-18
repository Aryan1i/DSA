//Problem
    
    /*Given two binary trees, a and b, check whether the two trees are mirror images of each other.  Two binary trees are mirror images if:
    
    Their root nodes have the same value.
    The left subtree of the first tree is the mirror of the right subtree of the second tree.
    The right subtree of the first tree is the mirror of the left subtree of the second tree. 
    Examples:
    
    Input: a[] = [1, 3, 2, N, N, 5, 4], b[] = [1, 2, 3, 4, 5, N, N]
    
    Output: true
    Explanation: Both trees have the same values and opposite subtree structures, so they are mirror images.
    Input: a[] = [1, 2, 3], b[] = [1, 2, 4]
     
    Output: false
    Explanation:  The root values are the same, but the corresponding nodes 3 and 4 have different values. Therefore, the two trees are not mirror images of each other.
    Constraints:
    
    1 ≤ size of binary tree ≤ 105
    0 ≤ node.data ≤ 105
    */

//Solution

/* Structure of Binary Tree Node
class Node
{
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public boolean areMirror(Node a, Node b) {
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.data != b.data) return false;
        
        return areMirror(a.left, b.right) && areMirror(a.right, b.left);
    }
}

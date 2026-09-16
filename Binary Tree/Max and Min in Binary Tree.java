//Problem
    
    /*Given the root of a Binary Tree, find the maximum and minimum element present in the tree.
    
    Examples:
    
    Input: root[] = [2, 7, 5, N, 6, N, 9, 1, 11, 4]
     
    Output: 11 1
    Explanation: The maximum and minimum element in this binary tree is 11 and 1 respectively.
    Input: root[] = [6, 5, 8, 2]
    
    Output: 8 2
    Explanation: The maximum and minimum element in this binary tree is 8 and 2 respectively.
    Constraints:
    
    1 ≤ size of binary tree, node.data ≤ 105*/

//Solution

/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}*/

class Solution {
    public static int findMax(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        
        int l = findMax(root.left);
        int r = findMax(root.right);
        
        return Math.max(root.data,Math.max(l, r));
    }

    public static int findMin(Node root) {
         if(root == null) return Integer.MAX_VALUE;
        
        int l = findMin(root.left);
        int r = findMin(root.right);
        
        return Math.min(root.data,Math.min(l, r));
        
    }
}

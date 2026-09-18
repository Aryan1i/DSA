//Problem
    
    /*Given a binary tree, find subtree with maximum sum in the tree and return its sum.
    
    Examples:
    
    Input: root[] = [10, 8, 2, 3, 5, N, N]    
            
    Output: 28
    Explanation: 
    As all the tree elements are positive, the largest subtree sum is equal to sum of all tree elements.
    Input: root[] = [1, -2, 3, 4, 5, -6, 2]
            
    Output: 7
    Explanation: 
    Subtree with largest sum is : 
             
    The whole tree sum is also 7. 
    Constraints:
    1 ≤ n ≤ 105, n si the number of nodes in the tree.
    -103 ≤ node->data ≤ 103
    
    */

//Solution

/* structure of binary tree node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public static int maxSubtreeSum(Node root) {
        int[] ans = solve(root);
        return ans[0];
    }
    
    public static int[] solve(Node root){
        if(root == null) return new int[]{Integer.MIN_VALUE, 0};
        
        int[] l = solve(root.left);
        int[] r = solve(root.right);
        
        int mss = Math.max(l[1] + r[1] + root.data, Math.max(l[0], r[0]));
        int ss = l[1] + r[1] + root.data;
        
        return new int[]{mss, ss};
        
    }
}

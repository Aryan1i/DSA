//Problem
    
    /*Given a binary tree, find the sum of values of all the nodes. 
    
    Examples:
    
    Input: root = [15, 10, 20, 8, 12, 16, 25]
    
    Output: 106
    Explanation: The sum of all the nodes is 15 + 10 + 20 + 8 + 12 + 16 + 25 = 106
    .
    Input: root = [1, 3, 2]
    
    Output: 6
    Explanation: The sum of all the nodes is 1 + 2 + 3 = 6.
    Input: root = [1, 2, N, 4, N]
    
    Output: 7
    Explanation: The sum of all the nodes is 1 + 2 + 4 = 7.
    Constraints:
    1 ≤ number of nodes ≤ 104
    -105 ≤ Node data ≤ 105
    
    */

//Solution

/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
} */

class Solution {
    static int sumBT(Node root) {
        if(root == null) return 0;
        int sum = root.data;
        sum += sumBT(root.left);
        sum += sumBT(root.right);
        return sum;
    }
}

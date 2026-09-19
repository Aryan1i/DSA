//Problem
    
    /*Given a root of a Binary Tree, return its boundary traversal in the following order:
    
    Left Boundary: Nodes from the root to the leftmost non-leaf node, preferring the left child over the right and excluding leaves.
    Leaf Nodes: All leaf nodes from left to right, covering every leaf in the tree.
    Reverse Right Boundary: Nodes from the root to the rightmost non-leaf node, preferring the right child over the left, excluding leaves, and added in reverse order.
    Note: The root is included once, leaves are added separately to avoid repetition, and the right boundary follows traversal preference not the path from the rightmost leaf.
    
    Examples:
    
    Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]
    Output: [1, 2, 4, 8, 9, 6, 7, 3]
    Explanation:
    
    Input: root = [1, N, 2, N, 3, N, 4, N, N] 
    Output: [1, 4, 3, 2]
    Explanation:
    
    Left boundary: [1] (as there is no left subtree)
    Leaf nodes: [4]
    Right boundary: [3, 2] (in reverse order)
    Final traversal: [1, 4, 3, 2]
    Constraints:
    1 ≤ number of nodes ≤ 105
    1 ≤ node->data ≤ 105*/

//Solution

/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
     ArrayList<Integer> boundaryTraversal(Node root) {
         ArrayList<Integer> ans = new ArrayList<>();

         if (root == null) {
             return ans;
         }

         if (!isLeaf(root)) {
             ans.add(root.data);
         }

         addLeftBoundary(root.left, ans);
         addLeaves(root, ans);

         ArrayList<Integer> right = new ArrayList<>();
         addRightBoundary(root.right, right);

         for (int i = right.size() - 1; i >= 0; i--) {
             ans.add(right.get(i));
         }

         if (isLeaf(root) && ans.isEmpty()) {
             ans.add(root.data);
         }

         return ans;
     }

     boolean isLeaf(Node node) {
         return node != null &&
                node.left == null &&
                node.right == null;
     }

     void addLeftBoundary(Node node, ArrayList<Integer> ans) {
         while (node != null) {
             if (!isLeaf(node)) {
                 ans.add(node.data);
             }

             if (node.left != null) {
                 node = node.left;
             } else {
                 node = node.right;
             }
         }
     }

     void addLeaves(Node node, ArrayList<Integer> ans) {
         if (node == null) {
             return;
         }

         if (isLeaf(node)) {
             ans.add(node.data);
             return;
         }

         addLeaves(node.left, ans);
         addLeaves(node.right, ans);
     }

     void addRightBoundary(Node node, ArrayList<Integer> right) {
         while (node != null) {
             if (!isLeaf(node)) {
                 right.add(node.data);
             }

             if (node.right != null) {
                 node = node.right;
             } else {
                 node = node.left;
             }
         }
     }
 }

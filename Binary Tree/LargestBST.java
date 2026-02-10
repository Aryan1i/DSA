//Problem

/*You're given a binary tree. Your task is to find the size of the largest subtree within this binary tree that also satisfies the properties of a Binary Search Tree (BST). The size of a subtree is defined as the number of nodes it contains.

Note: A subtree of the binary tree is considered a BST if for every node in that subtree, the left child is less than the node, and the right child is greater than the node, without any duplicate values in the subtree.

Examples :

Input: root = [5, 2, 4, 1, 3]
Root-to-leaf-path-sum-equal-to-a-given-number-copy
Output: 3
Explanation:The following sub-tree is a BST of size 3
Balance-a-Binary-Search-Tree-3-copy
Input: root = [6, 7, 3, N, 2, 2, 4]

Output: 3
Explanation: The following sub-tree is a BST of size 3:

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105*/

//Solution

// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {

    static int largestBst(Node root) {
        pair p = isBST(root);
        return p.maxBST;
    }
    
    public static class pair{
        boolean isBST;
        int max;
        int min;
        int totalNode;
        int maxBST;
    }
    
    public static pair isBST(Node root){
        
        if(root == null){
            pair temp = new pair();
            temp.isBST = true;
            temp.max = Integer.MIN_VALUE;
            temp.min = Integer.MAX_VALUE;
            temp.totalNode = 0;
            temp.maxBST = 0;
            return temp;
        }
        
        pair left = isBST(root.left);
        pair right = isBST(root.right);
        
        pair mpair = new pair();
        mpair.isBST = false;
        if(left.isBST && right.isBST && left.max < root.data && right.min > root.data){
            mpair.isBST = true;
        }
        
        
        mpair.max = Math.max(root.data,Math.max(left.max,right.max));
        mpair.min = Math.min(root.data,Math.min(left.min,right.min));
        
        mpair.totalNode = left.totalNode + right.totalNode + 1;
        
        if(mpair.isBST == true){
            mpair.maxBST = mpair.totalNode;
        } else {
            mpair.maxBST = Math.max(left.maxBST, right.maxBST);
        }
        
        return mpair;
    }
}

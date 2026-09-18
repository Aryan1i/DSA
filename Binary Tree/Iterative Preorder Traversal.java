//Problem
    
    /*Given a Binary tree. Find the preorder traversal of the tree without using recursion.
    
    Follow up: Try solving this with O(1) auxiliary space.
    
    
    Examples:
    
    Input: root[] = [1, 2, 3, 4, 5]
    
    Output: [1, 2, 4, 5, 3]
    Explanation: Preorder traversal (Root->Left->Right) of the tree is 1 2 4 5 3.
    Input: root[] = [8, 1, 5, N, 7, 10, 6, N, 10, 6]
    
    Output: [8, 1, 7, 10, 5, 10, 6, 6] 
    Explanation: Preorder traversal (Root->Left->Right) of the tree is 8 1 7 10 5 10 6 6.
    Constraints:
    
    1 ≤ size of binary tree ≤ 105
    0 ≤ node.data ≤ 105*/

//Solution

/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Stack<Node> st = new Stack<>();
        
        Node curr = root;
        
        while(curr != null || !st.isEmpty()){
            if(curr != null){
                ans.add(curr.data);
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                curr = curr.right;
            }
        }
        
        return ans;
    }
}

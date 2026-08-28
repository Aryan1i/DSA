//Problem
    
    /*Given a binary tree. Find the inorder traversal of the tree without using recursion.
    
    Examples
    
    Input:  
    
    Output: 4 2 5 1 3
    Explanation: Inorder traversal (Left->Root->Right) of the tree is [4, 2, 5, 1, 3].
    Input:
    
    Output: 1 7 10 8 6 10 5 6
    Explanation: Inorder traversal (Left->Root->Right) of the tree is [1, 7, 10, 8, 6, 10, 5, 6].
    Constraints:
    1 ≤ Number of nodes ≤ 105
    1 ≤ Node data ≤ 105
    */

//Solution

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        Stack<Node> st = new Stack<>();
        Node curr = root;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(curr != null || !st.isEmpty()){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            } else {
                curr = st.pop();
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        
        return ans;
    }
}

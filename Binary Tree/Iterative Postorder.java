//Problem
    
    /*Given a binary tree root[]. Find the postorder traversal of the tree without using recursion. Return a list containing the postorder traversal of the tree, calculated without using recursion.
    
    Examples :
    
    Input: root[] = [1, 2, 3, 4, 5]
    
    Output: [4, 5, 2, 3, 1]
    Explanation: Postorder traversal (Left->Right->Root) of the tree is 4 5 2 3 1.
    Input: root[] = [8, 1, 5, 7, 10, 6, 10, 6]
     
    Output: [10, 7, 1, 6, 10, 6, 5, 8] 
    Explanation: Postorder traversal (Left->Right->Root) of the tree is 10 7 1 6 10 6 5 8.
    Constraints:
    
    1 ≤ size of binary tree ≤ 105
    1 ≤ node.data ≤ 106
    */

//Solution

/* Binary Tree Node Structure
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        if(node == null) return new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        
        st1.push(node);
        while(!st1.isEmpty()){
            Node curr = st1.pop();
            
            st2.push(curr);
            
            if(curr.left != null) st1.push(curr.left);
            if(curr.right != null) st1.push(curr.right);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(!st2.isEmpty()){
            ans.add(st2.pop().data);
        }
        
        return ans;
    }
}

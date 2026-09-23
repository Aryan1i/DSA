//Problem
    
    /*
    
    Given the preorder and inorder traversals of a binary tree, return its postorder traversal.
    
    You are required to complete the function getPostorder() that returns the nodes of the tree in postorder sequence.
    
    Note: All node values are distinct.
    
    Examples:
    
    Input: inorder[] = [4, 2, 5, 1, 3, 6], preorder[] = [1, 2, 4, 5, 3, 6]         
    Output: [4, 5, 2, 6, 3, 1]
    Explanation: The given traversals correspond to the below binary tree
    
    Postorder of the tree is [4, 5, 2, 6, 3, 1].
    Input: inorder[] = [2, 1, 4, 3, 5], preorder[] = [1, 2, 3, 4, 5]        
    Output: [2, 4, 5, 3, 1]
    Explanation: The given traversals correspond to the below binary tree
     
    Postorder of the tree is [2, 4, 5, 3, 1].
    Constraints:
    1 ≤ n ≤ 105
    
    */

//Solution

class Solution {
    public int[] getPostorder(int[] inorder, int[] preorder) {
        int n = inorder.length;
        ArrayList<Integer> ans = new ArrayList<>();
        solve(inorder,preorder, 0, n - 1, 0, n - 1, ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public void solve(int[] inorder, int[] preorder, int ps, int pe, int is, int ie, ArrayList<Integer> ans){
        if (ps > pe || is > ie) return;
        int x = -1;
        for(int i = is; i <= ie; i++){
            if(preorder[ps] == inorder[i]){
                x = i;
                break;
            }
        }
        
        if (x == -1) return;
        
        int le = x - is;
        solve(inorder, preorder, ps + 1, ps + le, is, x -1, ans );
        solve(inorder, preorder, ps + le + 1,pe, x + 1, ie, ans);
        
        ans.add(preorder[ps]);
        
    }
}

//Problem
    
    /*You are given the root of a binary tree, and your task is to return its bottom view. The bottom view of a binary tree is the set of nodes visible when the tree is viewed from the bottom.
    
    Note: If there are multiple bottom-most nodes for a horizontal distance from the root, then the latter one in the level order traversal is considered.
    
    Examples :
    
    Input: root = [1, 2, 3, 4, 5, N, 6]
        
    Output: [4, 2, 5, 3, 6]
    Explanation: The Green nodes represent the bottom view of below binary tree.
        
    Input: root = [20, 8, 22, 5, 3, 4, 25, N, N, 10, 14, N, N, 28, N]
        
    Output: [5, 10, 4, 28, 25]
    Explanation: The Green nodes represent the bottom view of below binary tree.
        
    Constraints:
    
    1 ≤ size of binary tree, node.data ≤ 105*/

//Solution

/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    class Pair{
        Node node;
        int col;
        Pair(Node node, int col){
            this.node = node;
            this.col = col;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        q.offer(new Pair(root, 0));
        
        int min = 0;
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 1; i <= size; i++){
                Pair p = q.poll();
                map.put(p.col, p.node.data);
                if(p.col < min) min = p.col;
                if(p.node.left != null) q.offer(new Pair(p.node.left, p.col - 1));
                if(p.node.right != null) q.offer(new Pair(p.node.right, p.col + 1));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(map.containsKey(min)){
            ans.add(map.get(min++));
        }
        
        return ans;
    }
}

//Problem
    
    /*You are given the root of a binary tree, and your task is to return its top view. The top view of a binary tree is the set of nodes visible when the tree is viewed from the top.
    
    Note:
    
    Return the nodes from the leftmost node to the rightmost node.
    If multiple nodes overlap at the same horizontal position, only the topmost (closest to the root) node is included in the view. 
    Examples:
    
    Input: root = [1, 2, 3]
    Output: [2, 1, 3]
    Explanation: The Green colored nodes represents the top view in the below Binary tree.
     
    Input: root = [10, 20, 30, 40, 60, 90, 100]
    Output: [40, 20, 10, 30, 100]
    Explanation: The Green colored nodes represents the top view in the below Binary tree.
    
    
    Constraints:
    
    1 ≤ size of binary tree, node.data ≤ 105*/

//Solution

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    class Pair{
        Node n;
        int c;
        
        Pair(Node n, int c){
            this.n = n;
            this.c = c;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Queue<Pair> q = new ArrayDeque<>();
        
        q.offer(new Pair(root, 0));
        
        int min = Integer.MAX_VALUE;
        
        while(q.size() > 0){
            Pair top = q.poll();
            
            Node n = top.n;
            int c = top.c;
            
            if(!map.containsKey(c)){
                map.put(c, n.data);
            }
            
            min = Math.min(min, c);
            
            if(n.left != null) q.offer(new Pair(n.left, c - 1));
            if(n.right != null) q.offer(new Pair(n.right, c+1));
            
            
        }
        
        while(map.containsKey(min)){
            ans.add(map.get(min));
            min++;
        }
        
        return ans;
        
    }
}

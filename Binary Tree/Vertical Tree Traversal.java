//Problem
    
    /*Given the root of a Binary Tree, find the vertical traversal of the tree starting from the leftmost level to the rightmost level.
    
    Note: If there are multiple nodes passing through a vertical line, then they should be printed as they appear in level order traversal of the tree.
    
    Examples:
    
    Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, N, 8, N, 9, N, 10, 11, N]
                        
    Output: [[4], [2], [1, 5, 6, 11], [3, 8, 9], [7], [10]]
    Explanation: The below image shows the horizontal distances used to print vertical traversal starting from the leftmost level to the rightmost level.
         
    Input: root = [1, 2, 3, 4, 5, N, 6]
         
    Output: [[4], [2], [1, 5], [3], [6]]
    Explanation: From left to right the vertical order will be [[4], [2], [1, 5], [3], [6]]
    Constraints:
    
    1 ≤ size of binary tree, node.data ≤ 105
    */

//Solution

/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    class Pair{
        Node n;
        int c;
        
        Pair(Node n, int c){
            this.n = n;
            this.c = c;
        }
        
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        Queue<Pair> q = new ArrayDeque<>();
        
        int min = Integer.MAX_VALUE;
        
        q.offer(new Pair(root, 0));
        
        while(!q.isEmpty()){
            Pair top = q.poll();
            
            Node n = top.n;
            int c = top.c;
            
            if(!map.containsKey(c)){
                map.put(c, new ArrayList<>());
            }
            
            map.get(c).add(n.data);
            
            if(c < min) min = c;
            
            if(n.left != null)  q.offer(new Pair(n.left, c - 1));
            if(n.right != null) q.offer(new Pair(n.right, c + 1));
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        while(map.containsKey(min)){
            ans.add(map.get(min));
            min++;
        }
        
        return ans;
    }
}

//Problem
    
    /*Given the root of a Binary Tree, find all nodes that do not have a sibling. Return the nodes in increasing order.
    
    Two nodes are considered siblings if they share the same parent.
    
    Note:
    
    The root node cannot have a parent, so it should not be included in the answer 
    If every node has a sibling, return a list containing only -1.
    Examples:
    
    Input: root = [37, 20, N, N, 113]
    
    Output: [20, 113]
    Explanation: Nodes 20 and 113 dont have any siblings.
    Input: root[] = [1, 2, 3, 4]
    
    Output: [4]
    Explanation: Node 4 does not have a sibling.
    Input: root[] = [37, 40, 13]
    
     Output: [-1]
    Explanation: Every node of the tree has a sibling.
    Constraints:
    1 ≤ number of nodes ≤ 104
    1 ≤ node->data ≤ 104*/

//Solution

/*  A Binary Tree nodea
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree {
    ArrayList<Integer> noSibling(Node node) {
        
        ArrayList<Integer> list = temp(node);
        if(list.size() == 0)list.add(-1);
        
        Collections.sort(list); 
        
        return list;
    }
    
    ArrayList<Integer> temp(Node node) {
        
        ArrayList<Integer> list = new ArrayList<>();
        if(node== null) return list;
        
        if(node.left== null && node.right==null){
            return list;
        }
        
        if(node.left == null){
            list.add(node.right.data);
        }
        
        if(node.right== null){
            list.add(node.left.data);
        }
        
        List<Integer> left = temp(node.left);
        List<Integer> right = temp(node.right);
        
        
        list.addAll(left);
        list.addAll(right);
        
        return list;
    }
}

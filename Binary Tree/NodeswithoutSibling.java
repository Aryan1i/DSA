//Problem

    /*Given a Binary Tree, find all the nodes that don't have any siblings. You need to return a list of integers containing all the nodes that don't have a sibling in sorted order (Increasing). Two nodes are said to be siblings if they are present at the same level, and their parents are the same.
    
    Note: The root node can not have a sibling so it cannot be included in our answer. If there are no nodes that do not have a sibling then add-1 in the list.
    
    Examples:
    
    Input: root[] = [37, 20, N, 113]
           37
          /   
        20
        /     
      113 
    
    Output: [20, 113]
    Explanation: Nodes 20 and 113 dont have any siblings.
    Input: root[] = [1, 2, 3, 4]
           1
          / \
         2   3
        /
         4
    
    Output: [4]
    Explanation: Node 4 does not have a sibling.
    Input: root[] = [37, 40, N, 13]
           37
          /   
        40
        /     
      13 
    
    Output: [40, 13]
    Explanation: Nodes 40 and 13 dont have any siblings.
    Constraints:
    1 ≤ number of nodes ≤ 104
    1 ≤ node->data ≤ 104
    
    */

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

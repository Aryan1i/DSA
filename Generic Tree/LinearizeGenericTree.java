//Problem

    /*Given a generic tree, linearize it in-place. Linearizing a tree means rearranging each subtree so that every node has at most one child, making it a linked-list-like structure. After linearization, each node’s first child should point to the next node in the "flattened" structure.
    
    
    Constraints
    The tree has at most 10,000 nodes.
    The value of each node is an integer between -10^6 and 10^6.
    Each node has between 0 and 100 children.
    
    Sample Test Cases
    Input 1:
    1 2 -1 3 -1 -1
    
    Expected Output 1:
    1
    2
    3*/

//Solution

class Solution {
    public void linearize(Node node) {
        for(Node child: node.children){
            linearize(child);
        }
        while(node.children.size()>1){
            Node lt =node.children.remove(node.children.size()-1);
            Node sl=node.children.get(node.children.size()-1);
            Node slt=getTail(sl);
            slt.children.add(lt);
        }
    }

    public static Node getTail(Node node){
        while(node.children.size()!=0){
            node=node.children.get(0);
        }
        return node;
    }
}

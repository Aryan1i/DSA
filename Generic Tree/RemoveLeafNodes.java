//Problem

    /*Given a generic tree, remove all leaf nodes from it. A leaf node is a node that has no children. After removing all the leaf nodes, print the tree in level order.
    
    
    Constraints
    The tree has at most 10,000 nodes.
    The value of each node is an integer between -10^6 and 10^6.
    Each node has between 0 and 100 children.
    
    Sample Test Cases
    Input 1:
    1 2 -1 3 -1 -1
    
    Expected Output 1:
    1*/

//Solution

import java.io.*;
import java.util.*;

class Node {
    int data;
    ArrayList<Node> children;

    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

class Solution {
    public void removeLeaves(Node node) {
        for (int i=node.children.size()-1;i>=0;i--){
            Node child = node.children.get(i);
            if(child.children.size()==0){
                node.children.remove(child);
            }
        }

        for(Node child:node.children){
            removeLeaves(child);
        }
    }
}

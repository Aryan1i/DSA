//Problem
    
    /*Given the head of a singly linked list. A cycle exists if the last node points back to a previous node, forming a loop. Remove the loop from the linked list if it exists.
    
    Internally, the driver code uses a variable x (1-based indexing) to represent the position of the node to which the last node is connected.
    
    The driver code will print "true" if the linked list is correctly modified, otherwise it will print "false".
    
    Examples:
    
    Input:
    
    Output: true
    Explanation: The linked list contains a loop that begins at node x = 2. After removing the loop, the driver code prints true.
    Input:
    
    Output: true
    Explanation: The linked list does not contain a loop (x = 0).
    Input: 
    
    Output: true
    Explanation: The linked list contains a loop that begins at node x = 1. After removing the loop, the driver code prints true.
    Constraints:
    1 ≤ size of linked list ≤ 105
    0 ≤ x ≤ size of linked list*/

//Solution

/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        if(head == null) return ;
        HashSet<Node> set = new HashSet<>();
        
        while(head.next != null){
            if(set.contains(head.next)){
                head.next = null;
                break;
            }
            set.add(head);
            head = head.next;
        }
        
    }
}

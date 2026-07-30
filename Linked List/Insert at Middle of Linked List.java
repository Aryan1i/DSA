//Problem
    
    /*Given the head of a Singly Linked List and a value x. Insert the key in the middle of the linked list.
    
    Examples :
    
    Input: 1->2->4, x = 3
    Output: 1->2->3->4
    Explanation: 
    
    Input: 10->20->40->50, x = 30
    Output: 10->20->30->40->50
    Explanation: 
    
    Constraints:
    0 ≤ number of nodes ≤ 105
    0 ≤ node->data , x ≤ 103*/

//Solution

/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        if(head == null) return new Node(x);
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node temp = slow.next;
        slow.next = new Node(x);
        slow.next.next = temp;
        
        return head;
    }
}

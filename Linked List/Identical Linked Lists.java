//Problem
    
    /*Given the heads of two singly linked lists, head1 and head2, the task is to determine whether the two linked lists are identical. Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order. Return true if both lists are identical; otherwise, return false.
    
    Examples:
    
    Input: head1: 1->2->3->4->5->6, head2: 99->59->42->20
    Output: false
    Explanation:
    
    As shown in figure the two lists are not identical.
    Input: head1: 1->2->3->4->5, head2: 1->2->3->4->5
    Output: true
    Explanation: 
     
    As shown in figure both are identical.
    Constraints:
    1 ≤ length of lists ≤ 105
    1 ≤ elements of lists ≤ 105*/

//Solution

/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        while(head1 != null && head2 != null){
            if(head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        
        return (head1 == null && head2 == null);
    }
}

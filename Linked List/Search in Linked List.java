//Problem

    /*Given a linked list with the head node and a key, the task is to check if the key is present in the linked list or not. Return true if key is present, else return false.
    
    Example:
    
    Input: key = 3,
          
    Output: true 
    Explanation: 3 is present in Linked List.
    Input: key = 4,
       
    Output: false
    Explanation: 4 is not present in Linked List.
    Constraint:
    1 ≤ Number of nodes ≤ 105
    1 ≤ node.data, key ≤ 105*/

//Solution

/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        if(head == null) return false;
        
        if(head.data == key) return true;
        if(searchKey(head.next, key)) return true;
        
        return false;
    }
}

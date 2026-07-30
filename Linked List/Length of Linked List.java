//Problem

    /*Given head of a singly linked list. Find the length of the linked list, where length is defined as the number of nodes in the linked list.
    
    Examples :
    
    Input: head: 1 -> 2 -> 3 -> 4 -> 5
    
    Output: 5
    Explanation: Length of the linked list is 5, as there are 5 nodes present in it.
    Input: head: 2 -> 4 -> 6 -> 7 -> 5 -> 1 -> 0
     
    Output: 7
    Explanation: Length of the linked list is 7, as there are 7 nodes present in it.
    Constraints:
    1  ≤  number of nodes  ≤  4*104
    1  ≤  node->data  ≤  103
    
    */

//Solution

/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        int c = 0;
        while(head != null){
            head = head.next;
            c++;
        }
        return c;
    }
}

//Problem
    
    /*Given the head of a Singly Linked List and a number k, find the data of the modular node of the linked list. If no such index is present return -1.
    
    A modular node is defined as the last node in the linked list whose position is divisible by k (pos % k==0). 
    
    Note: 1-based position is followed, i.e., position of the first node is 1 and second node is 2.
    
    Examples :
    
    Input: head: 19->28->37->46->55, k = 2
    
    Output: 46
    Explanation: The position 4 is divisible by k. The node at this position is 46.
    Input: head: 1->2->3->4->5->6->7, k = 10
     
    Output: -1
    Explanation: No position is divisible by k as the max position is 7 only.
    Constraints:
    1 <= number of nodes <= 105
    1 <= node->data , k <= 105
    
    */

//Solution

/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/

class Solution {
    public int modularNode(Node head, int k) {
        int ans = 0;
        int pos = 1;
        
        while(head != null){
            if(pos % k == 0){
                ans = head.data;
            }
            head = head.next;
            pos++;
        }
        
        return (ans == 0)? -1 : ans;
    }
}

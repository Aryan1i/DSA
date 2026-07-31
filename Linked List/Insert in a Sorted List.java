//Problem

    /*
    Given a linked list sorted in ascending order and an integer called key, insert data in the linked list such that the list remains sorted.
    
    Examples:
    
    Input: LinkedList: 25->36->47->58->69->80, key: 19
    Output: 19->25->36->47->58->69->80
    
    Explanation: After inserting 19 the sorted linked list will look like the one in the output.
    Input: LinkedList: 50->100, key: 75
    Output: 50->75->100
    
    Explanation: After inserting 75 the sorted linked list will look like the one in the output.
    Constraints:
    1 <= size of linked list <= 106
    1 <= data of nodes <= 106
    */

//Solution

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        if(head == null) return new Node(key);
        if(head.data > key){
            Node newHead = new Node(key);
            newHead.next = head;
            return newHead;
        }
        
        Node temp = head;
        while(temp.next != null && temp.next.data < key){
            temp = temp.next;
        }
        
        Node next = temp.next;
        temp.next = new Node(key);
        temp.next.next = next;
        
        return head;
    }
}

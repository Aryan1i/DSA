//Problem
    
    /*Implement a Deque (Double Ended Queue) using a doubly linked list. The Deque must support the following operations:
    
    (i) insertFront(x): Adds an element x at the front of Deque.
    (ii) insertRear(x): Adds an element x at the rear of Deque.
    (iii) deleteFront(): Deletes an element from front of Deque. 
    (iv) deleteRear(): Deletes an element from rear of Deque.
    (v) getFront(): Gets the front element from queue. Return -1 if it is empty.
    (vi) getRear(): Gets the last element from queue. Return -1 if it is empty.
    
    There will be a sequence of queries queries[][]. The queries are represented in numeric form:
    
    1 x : Call insertFront(x)
    2 x : Call insertRear(x)
    3 : Call deleteFront()
    4 : Call deleteRear()
    5 : Call getFront()
    6 : Call getRear()
    You just have to implement the functions insertFront, insertRear, deleteFront, deleteRear, getFront and getRear and the driver code will handle the input & output.
    
    Note: It is guaranteed that all the queries are valid.
    
    Examples:
    
    Input: q = 6, queries[][] = [[1, 3], [2, 5], [1, 6], [6], [3], [5]]
    Output: [5, 3]
    Explanation: Queries on Deque are as follows:
    insertFront(3): Insert 3 at the front of the Deque.
    insertRear(5): Insert 5 at the rear of the Deque.
    insertFront(6): Insert 6 at the front of the Deque.
    getRear(): Return the rear element i.e 5.
    deleteFront(): Remove the front element 6 from the Deque.
    getFront(): Return the front element i.e 3.
    Input: q = 4, queries[][] = [[2, 4], [3], [6], [5]]
    Output: [-1, -1]
    Explanation: Queries on Deque are as follows:
    insertRear(4): Insert 4 at the rear of the Deque.
    deleteFront(): Remove the front element 4 from the Deque.
    getRear(): As the Deque is empty return -1.
    getFront(): As the Deque is empty return -1.
    Constraints:
    1 ≤ number of query ≤ 103
    0 ≤ x ≤ 105*/

//Solution

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class myDeque {
    Node front;
    Node rear;
    
    myDeque() {
        front = null;
        rear = null;
    }

    void insertFront(int x) {
        Node newNode = new Node(x);
        if(front == null){
            front = newNode;
            rear = newNode;
            return;
        }
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

    void insertRear(int x) {
        Node newNode = new Node(x);
        if(rear == null){
            front = newNode;
            rear = newNode;
            return;
        }
        newNode.prev = rear;
        rear.next = newNode;
        rear = newNode;
    }

    void deleteFront() {
        if(front == null) return;
        front = front.next;
        if(front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
    }

    void deleteRear() {
        if(rear == null) return;

        rear = rear.prev;

        if(rear == null) {
            front = null;
        } else {
            rear.next = null;
        }
    }

    int getFront() {
        if(front == null) return -1;
        else return front.data;
    }

    int getRear() {
        if(rear == null) return -1;
        else return rear.data;
    }
}

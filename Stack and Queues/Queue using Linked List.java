//Problem
    
    /*Implement a Queue using a Linked List, this queue has no fixed capacity and can grow dynamically until memory is available.
    The Queue must support the following operations:
    
    (i) enqueue(x): Insert an element x at the rear of the queue.
    (ii) dequeue(): Remove the front element from the queue. If the queue is empty, do nothing.
    (iii) getFront(): Return front element if not empty, else -1.
    (iv) isEmpty(): Return true if the queue is empty else return false.
    (v) size(): Return the number of elements currently in the queue.
    
    There will be a sequence of queries queries[][]. The queries are represented in numeric form:
    
    1 x : Call enqueue(x)
    2: Call dequeue()
    3: Call getFront()
    4: Call isEmpty()
    5: Call size()
    You just have to implement the functions enqueue, dequeue, getFront,  isEmpty and size. The driver code will handle the input and output.
    
    Examples:
    
    Input: q = 7, queries[][] = [[1, 5], [1, 3], [1, 4], [3], [2], [5], [4]]
    Output: [5, 2, false]
    Explanation: Queries on queue are as follows:
    enqueue(5): Insert 5 at the rear of the queue.
    enqueue(3): Insert 3 at the rear of the queue.
    enqueue(4): Insert 4 at the rear of the queue.
    getFront(): Return the front element i.e 5.
    dequeue(): Remove the front element 5 from the queue.
    size(): Queue now has 2 elements.
    isEmpty(): Queue is not empty return false.
    Input: q = 4, queries[][] = [[4], [3], [1, 10], [5]]
    Output: [true, -1, 1]
    Explanation: Queries on queue are as follows:
    isEmpty(): Queue is empty return true.
    getFront(): Queue is empty return -1.
    enqueue(10): Insert 10 at the rear of the queue.
    size(): Queue contains 1 element return 1.
    Constraints:
    1 ≤ number of query ≤ 103
    0 ≤ x ≤ 105*/

//Solution

// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {
    Node head;
    Node curr;
    int size;
    public myQueue() {
        head = null;
        curr = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if(size == 0){
            head = newNode;
            curr = newNode;
        } else {
            curr.next = newNode;
            curr = newNode;
        }
        size++;
    }

    public void dequeue() {
        if(size == 0) return;
        head = head.next;
        if(head == null) curr = null;
        size--;
    }

    public int getFront() {
        if(size == 0) return -1;
        else return head.data;
    }

    public int size() {
        return size;
    }
}

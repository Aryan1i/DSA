    //Problem
    
    /*Implement a class MinHeap that supports the following operations:
    
    push(x) – push element x into the heap
    pop() – remove the top element from the heap
    peek() – return top element from the heap, if empty return -1
    size() - return the no of elements in the heap.
    There will be a sequence of queries queries[][]. The queries are represented in numeric form:
    
    1 x : call push(x)
    2: call pop()
    3: call peek()
    4: call size()
    The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), size() operation.
    
    You only need to implement the above four functions.
    
    Examples :
    
    Input: q = 5, queries[][] = [[1, 3], [1, 7], [3], [1, 2], [3]]
    Output: [3, 2]
    Explanation:
    push(3): heap is [3]
    push(7): heap is [3, 7]
    peek(): return top element 3
    push(2): heap is [2, 3, 7]
    peek(): return top element 2
    Input: q = 6, queries[][] = [[1, 4], [1, 8], [1, 7], [2], [3], [4]]
    Output: [7, 2]
    Explanation:
    push(4): heap is [4]
    push(8): heap is [4, 8]
    push(7): heap is [4, 7, 8]
    pop(): remove top element 4, now heap is [7, 8]
    peek(): return top element 7
    size(): return no of elements in the heap
    Constraints:
    1 ≤ q ≤ 103
    1 ≤ x ≤ 105
    
    */

//Solution

class MinHeap {

    ArrayList<Integer> list;
    public MinHeap() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
        
        int c = list.size() - 1;
        int p = (c - 1) / 2;
        while(c != 0 && list.get(p) > list.get(c)){
            Collections.swap(list, p, c);
            c = p;
            p = (c - 1) / 2;
        }
    }

    public void pop() {
        int s = list.size();
        int n = list.size();
        
        Collections.swap(list, 0, n-1);
        list.remove(n - 1);
        n--;
        int i = 0;
        while(2 * i + 1 < n){
            int mini = 2 * i + 1;
            if(2 * i + 2 < n && list.get(2 * i + 2) < list.get(mini)) mini = 2 * i + 2;
            
            if(list.get(mini) < list.get(i)){
                Collections.swap(list, mini, i);
                i = mini;
            } else  break;
        }
    }

    public int peek() {
        if(list.size() == 0) return -1;
        else return list.get(0);
    }

    public int size() {
        return list.size();
    }
}

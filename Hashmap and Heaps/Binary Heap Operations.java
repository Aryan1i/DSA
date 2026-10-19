    //Problem
    
    /*Given an initially empty Binary Min Heap and a list of queries. Process each query by performing the corresponding heap operation.
    
    The queries are of the following types:
    
    [1, x]: Insert the value x into the Binary Min Heap.
    [2, x]: Delete the element present at index x in the current Binary Min Heap. If the index is invalid, ignore the query.
    [3]: Remove and return the minimum element from the Binary Min Heap. If the heap is empty, return -1.
    Implement the following methods:
    
    insertKey(x): Inserts x into the Binary Min Heap.
    deleteKey(i): Deletes the element at index i from the Binary Min Heap.
    extractMin(): Removes and returns the minimum element from the Binary Min Heap, or -1 if the heap is empty.
    The driver code will invoke these methods according to the given queries.
    
    Examples :
    
    Input: queries[][] = [[1, 4], [1, 2], [3], [1, 6], [2, 0], [3], [3]]
    Output: [2, 6, -1]
    Explanation:
    - Initially, the Min Heap is empty.
    - Insert 4. The heap contains 4.
    - Insert 2. The heap is rearranged to satisfy the Min Heap property, with 2 at the root.
    - Extract the minimum element. The value 2 is removed and printed.
    - Insert 6. The heap contains 4 and 6.
    - Delete the element at index 0. The value 4 is removed, leaving only 6 in the heap.
    - Extract the minimum element. The value 6 is removed and printed.
    - Extract the minimum element again. Since the heap is empty, -1 is returned.
    Input: queries[][] = [[1, 8], [1, 9], [2, 1], [3], [3]]
    Output: [8, -1]
    Explanation:
    - Initially, the Min Heap is empty.
    - Insert 8. The heap contains 8.
    - Insert 9. The heap contains 8 and 9.
    - Delete the element at index 1. The value 9 is removed, leaving only 8 in the heap.
    - Extract the minimum element. The value 8 is removed and printed.
    - Extract the minimum element again. Since the heap is empty, -1 is returned.
    Constraints:
    
    1 ≤ q ≤ 104
    0 ≤ queries[i][j] ≤ 104
    */

//Solution


class MinHeap {
    int[] harr;
    int capacity;
    int heap_size;

    MinHeap(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }

    int parent(int i) { return (i - 1) / 2; }

    int left(int i) { return 2 * i + 1; }

    int right(int i) { return 2 * i + 2; }

    void insertKey(int k) {
        if (heap_size == capacity) {
            return;
        }

        // Insert at the end
        int i = heap_size;
        harr[i] = k;
        heap_size++;

        // Heapify up
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;

            i = parent(i);
        }
    }

    int extractMin() {
        if (heap_size <= 0) {
            return -1;
        }

        if (heap_size == 1) {
            heap_size--;
            return harr[0];
        }

        // Store minimum element
        int root = harr[0];

        // Move last element to root
        harr[0] = harr[heap_size - 1];
        heap_size--;

        // Restore min-heap property
        MinHeapify(0);

        return root;
    }

    void deleteKey(int i) {
        if (i < 0 || i >= heap_size) {
            return;
        }

        // Decrease the key to negative infinity
        decreaseKey(i, Integer.MIN_VALUE);

        // Remove the minimum element
        extractMin();
    }

    void decreaseKey(int i, int new_val) {
        harr[i] = new_val;

        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;

            i = parent(i);
        }
    }

    void MinHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;

        if (l < heap_size && harr[l] < harr[smallest]) {
            smallest = l;
        }

        if (r < heap_size && harr[r] < harr[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;

            MinHeapify(smallest);
        }
    }
}

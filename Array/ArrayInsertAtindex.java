//Problem

    /*You are given an array arr(0-based index) and two positive integer index and val. You need to insert an val at given index.
    
    Examples:
    
    Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90
    Output: 1 2 3 4 5 90
    Explanation: 90 is inserted at index 5(0-based indexing). After inserting,array elements are like [1, 2, 3, 4, 5, 90].
    Input: arr[] = [1, 2, 3, 4, 5], index = 2, val = 90
    Output: [1, 2, 90, 3, 4, 5]
    Explanation: 90 is inserted at index 2(0-based indexing). After inserting, array elements are like [1, 2, 90, 3, 4, 5].
    Constraints:
      1 ≤arr.size() ≤ 105
      0 ≤ element, arr[i] ≤ 106
      0 ≤ index ≤ arr.size() */

//Solution

import java.util.*;

class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        arr.add(index,val);
    }
}

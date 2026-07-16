//Problem
    
    /*Given an integer array arr[], that may contain duplicate elements and an index k (0-based), find the final position (0-based) of the element at index k after applying a stable sort on the array.
    
    Note: In a stable sort, elements with equal values retain their relative order from the original array.
    
    Examples:
    
    Input: arr[] = [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], k = 5
    Output: 4
    Explanation: The element at index 5 is 3. There are 2 elements smaller than 3, so the group of 3s starts at position 2. 
    Among all occurrences of 3 (at indices 0, 2, 5, 7), index 5 is the 3rd one (0-based rank 2). 
    Final position = 2 + 2 = 4.
    Input: arr[]= [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], k = 2
    Output: 3
    Explanation: The element at index 2 is 3. There are 2 elements smaller than 3, so the group of 3s starts at position 2. 
    Among all occurrences of 3 (at indices 0, 2, 5, 7), index 2 is the 2nd one (0-based rank 1). 
    Final position = 2 + 1 = 3.
    
    Constraints:
    
    1 ≤ arr.size() ≤ 106
    0 ≤ arr[i] ≤ 105
    0 ≤ k
    k.size() ≤ arr
    */

//Solution

class Solution {
    public int sortedIndex(int[] arr, int k) {
        // code Here
        int val = arr[k];
        int c= 0;
        for(int i = 0; i <= k; i++){
            if(arr[i] == val){
                c++;
            }
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                c--;
            }
            if(c == 0){
                return i;
            }
        }
        
        return 0;
    }
}

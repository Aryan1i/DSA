//Problem
    
    /*Given an array of n distinct elements. Check whether the given array is a k-sorted array or not. A k-sorted array is an array where each element is at most k distance away from its target position in the sorted array. 
    
    Examples
    
    Input: arr[] = {3, 2, 1, 5, 6, 4}, k = 2
    Output: true
    Explanation: Every element is at most 2 distance away from its target position in the sorted array.  
    Input: arr[] = {13, 8, 10, 7, 15, 14, 12}, k = 1
    Output: false
    Constraints:
    1 ≤ n ≤ 105
    0 ≤ k < n*/

//Solution

class Solution {
    static boolean isKSortedArray(int arr[], int k) {
        int n = arr.length;

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < n; i++) {
            if (i + k < n && arr[i] > sorted[i + k]) return false;
            if (i - k >= 0 && arr[i] < sorted[i - k]) return false;
        }

        return true;
    }
}

//Problem
    
    /*Given an integer array arr[] of size n, where each element lies in the range [0, n-1], transform the array such that every element at index i becomes:
    arr[i]=arr[arr[i]].
    
    The transformation must be performed in-place, meaning the same array should store both the original and updated values without using another array.
    
    Examples:
    
    Input: arr[] = [1, 0]
    Output: [0, 1]
    Explanation: The original array is [1, 0]. 
    At index 0, arr[0] = 1, so the new value becomes arr[1] = 0. 
    At index 1, arr[1] = 0, so the new value becomes arr[0] = 1. 
    Thus, the transformed array becomes [0, 1].
    Input: arr[] = [4, 0, 2, 1, 3]
    Output: [3, 4, 2, 0, 1]
    Explanation: The original array is [4, 0, 2, 1, 3]. 
    Each element is replaced by the value at index arr[i] in the original array. 
    So the new values become 3, 4, 2, 0, 1 respectively, and the transformed array becomes [3, 4, 2, 0, 1].
    Constraints:
    1 ≤ n ≤ 4*104
    0 ≤ arr[i] < n*/

//Solution

class Solution {
    public void arrange(int[] arr) {
        int n = arr.length;
        for(int i= 0; i < arr.length; i++){
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }
        
        for(int i= 0; i < arr.length; i++){
            arr[i] /= n;
        }
    }
}

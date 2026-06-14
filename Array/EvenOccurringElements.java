//Problem
    
    /*Given an array arr[] of integers, where most numbers occur an odd number of times, except for a few elements that appear an even number of times. Find and return the elements with even occurrences in the array.
    If no such element exists, return -1.
    Note: Elements should be returned in order of occurrence.
    
    Examples:
    
    Input: arr[] = [9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15]
    Output: [12, 15, 23]
    Explanation: The numbers 12, 15, and 23 each appear an even number of times.
    Input: arr[] = [23, 12, 56, 34, 32]
    Output: [-1]
    Explanation: Every number in the array occurs an odd number of times.
    Expected Time Complexity: O(n)
    Expected Auxiliary Space: O(n)
    
    Constraints:
    
    1 ≤ arr.size() ≤ 106
    1 ≤ arr[i] ≤ 105*/

//Solution

import java.util.Arrays;
class Solution {
    public List<Integer> findEvenOccurrences(int[] arr) {
        int[] fre = new int[100000];
        
        for(int i = 0; i < arr.length; i++){
            fre[arr[i]]++;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(ans.contains(arr[i])) continue;
            if(fre[arr[i]] % 2 == 0){
                ans.add(arr[i]);
            }
        }
        
        if(ans.size() == 0) ans.add(-1);
        
        return ans;
    }
}

//Problem
    
    /*You are given an array arr[] of integers. Your task is to find the count of elements before which all the elements are smaller. The first element is always counted as there are no elements before it.
    
    Examples:
    
    Input: arr[] = [10, 40, 23, 35, 50, 7]
    Output: 3
    Explanation: The elements 10, 40, and 50 are such that all preceding elements are smaller. Thus, the count is 3.
    Input: arr[] = [5, 4, 1]
    Output: 1
    Explanation: Only the first element 5 is such that all preceding elements (none in this case) are smaller. Thus, the count is 1.
    Expected Time Complexity: O(n)
    Expected Auxiliary Space: O(1)
    
    Constraints:
    
    1 ≤ arr.size() ≤ 10^6
    1 ≤ arr[i] ≤ 10^9*/

//Solution

class Solution {
    public int countElements(int[] arr) {
        // code here
        int max = arr[0];
        int ans = 1;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) {
                ans++;
                max = arr[i];
            }
        }
        return ans;
    }
}

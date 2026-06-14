//Problem

    /*Given an integer array arr[], return the count of all the distinct elements in an array
    
    Examples:
    
    Input: arr[] = [2, 2, 3, 2]
    Output: 2
    Explanation: Distinct elements are {2, 3}
    Input: arr[] = [12, 1, 14, 3, 16]
    Output: 5
    Explanation: Distinct elements are {12, 1, 14, 3, 16}
    Input: arr[] = [1, 1, 1, 1]
    Output: 1
    Explanation: Only one distinct element {1}  
    Constraints:
    1  ≤  arr.size()  ≤  105
    -1000  ≤  arr[i]  ≤  1000*/

//Solution

import java.util.Arrays;
class Solution {
    static int distinct(int arr[]) {
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int ans = 1;
        
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]) ans++;
        }
        
        return ans;
    }
}

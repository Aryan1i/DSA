//Problem

/*Given an array arr[], find the sub-array containing at least one number which has the minimum sum and return its sum.

Examples :

Input: arr[] = {3,-4, 2,-3,-1, 7,-5}
Output: -6
Explanation: The subarray is {-4,2,-3,-1} = -6
Input: arr[] = {2, 6, 8, 1, 4}
Output: 1
Explanation: The sub-array is {1} = 1
Constraints:
1 ≤ N ≤ 106
-107 ≤ A[i] ≤ 107*/

//Solution

class Solution {
    static int smallestSumSubarray(int a[], int size) {
        int ans = 0;
        int min = a[0];
        
        for(int i = 0; i< a.length; i++){
            ans += a[i];
            
            if(ans < min){
                min = ans;
            }
            
            if(ans > 0){
                ans = 0;
            }
        }
        
        return min;
    }
}

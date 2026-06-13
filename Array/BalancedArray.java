//Problem

    /*Given an array arr[] of even size, find the minimum value that needs to be added to any one element so that the array becomes balanced. An array is considered balanced when the sum of elements in the left half is equal to the sum of elements in the right half.
    
    Examples :
    
    Input: arr = [1, 5, 3, 2]
    Output: 1
    Explanation: Sum of first 2 elements is 1 + 5  = 6, Sum of last 2 elements is 3 + 2  = 5, To make the array balanced you can add 1.
    Input: arr = [1, 2, 1, 2, 1, 3]
    Output: 2
    Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three elements is 2 + 1 + 3 = 6, To make the array balanced you can add 2.
    Constraints:
    2<=arr.size()<=107 where arr.size() is even.
    1<=arr[i]<=105
    
    */

//solution

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        int ans = 0;
        int l = 0;
        int r = arr.size() -1;
        while(l < r){
            ans = ans + (arr.get(l) - arr.get(r));
            l++;
            r--;
        }
        return Math.abs(ans);
    }
}

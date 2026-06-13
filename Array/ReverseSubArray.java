//Problem
    
    /*Given an array arr, you need to reverse a subarray of that array. The range of this subarray is given by indices l and r (1-based indexing).
    
    Examples:
    
    Input: arr[] = [1, 2, 3, 4, 5, 6, 7], l = 2, r = 4
    Output: [1, 4, 3, 2, 5, 6, 7]
    Explanation: After reversing the elements in range 2 to 4 (2, 3, 4), modified array is 1, 4, 3, 2, 5, 6, 7.
    Input: arr[] = [1, 6, 7, 4], l = 1, r = 4
    Output: [4, 7, 6, 1]
    Explanation: After reversing the elements in range 1 to 4 (1, 6, 7, 4), modified array is 4, 7, 6, 1.
    Constraints:
    1 ≤ arr.size() ≤ 106
    1 ≤ arr[i] ≤ 106
    1 ≤ l ≤ r ≤ arr.size()*/

//Solution

class Solution {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        l = l - 1;
        r = r - 1;
        
        while (l < r) {
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
            
            l++;
            r--;
        }
        
        return arr;
    }
}

//Problem

    /*Given a sorted array arr consisting of 0s and 1s. The task is to find the index (0-based indexing) of the first 1 in the given array.
    
    NOTE: If one is not present then, return -1.
    
    Examples :
    
    Input : arr[] = [0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
    Output : 6
    Explanation: The index of first 1 in the array is 6.
    Input : arr[] = [0, 0, 0, 0]
    Output : -1
    Explanation: 1's are not present in the array.
    Constraints:
    1 ≤ arr.size() ≤ 106
    0 ≤ arr[i] ≤ 1
    
    */

//Solution

class Solution {
    public int firstIndex(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        
        int ans = -1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == 0){
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        
        return ans;
    }
}

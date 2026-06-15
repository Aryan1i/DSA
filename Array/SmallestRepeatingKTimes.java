//Problem
    
    /*Given an array arr, the goal is to find out the smallest number that is repeated exactly ‘k’ times.
    
    Note: If there is no such element then return -1.
    
    Example:
    
    Input: arr[] = [2, 2, 1, 3, 1], k = 2
    Output: 1
    Explanation: 2 and 1 both appear exactly 2 times. Since we need to find the smallest, output is 1.
    Input: arr[] = [3, 5, 3, 2], k = 1
    Output:  2 
    Explanation: 5 and 2 each appear exactly 1 time. Since we need the smallest, the output is 2.
    Constraints:
    1 ≤ arr.size() ≤ 106
    1 ≤ arr[i] ≤ 104
    
    */

//Solution

class Solution {
    public int findDuplicate(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 1;
        int curr = arr[0];
        int ans = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == curr){
                count++;
            } else {
                if(count == k) return arr[i-1];
                count = 1;
                curr = arr[i];
            }
        }
        
        return count==k?arr[arr.length-1] : -1;
    }
}

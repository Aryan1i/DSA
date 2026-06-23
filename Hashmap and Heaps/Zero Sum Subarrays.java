//Problem

    /*You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.
    
    Examples:
    
    Input: arr[] = [0, 0, 5, 5, 0, 0]
    Output: 6
    Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].
    Input: arr[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7]
    Output: 4
    Explanation: The 4 subarrays are [-1, -3, 4], [-2, 2], [2, 4, 6, -12], 
    and [-1, -3, 4, -2, 2]
    Input: arr[] = [0]
    Output: 1
    Explanation: The only subarray is [0].
    Constraints:    
    1 <= n <= 106
    -109 <= arr[ i ] <= 109*/
    


class Solution {
    public int findSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        int count = 0;
        
        int[] psum = new int[arr.length];
        psum[0] = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            psum[i] = psum[i - 1] + arr[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(psum[i])){
                count += map.get(psum[i]);
            }
            map.put(psum[i], map.getOrDefault(psum[i], 0) + 1);
        }
        
        return count;
        
    }
}

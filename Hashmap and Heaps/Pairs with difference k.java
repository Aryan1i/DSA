//Problem

    /*Given an array arr[] of positive integers. Find the number of pairs of integers whose absolute difference equals to a given number k.
    Note: (a, b) and (b, a) are considered the same. Also, the same numbers at different indices are considered different.
    
    The answer is guaranteed to fit in a 32-bit integer.
    
    Examples:
    
    Input: arr[] = [1, 4, 1, 4, 5], k = 3
    Output: 4
    Explanation: There are 4 pairs with absolute difference 3, the pairs are {1, 4}, {1, 4}, {4, 1} and {1, 4}.
    Input: arr[] = [8, 16, 12, 16, 4, 0], k = 4
    Output: 5
    Explanation: There are 5 pairs with absolute difference 4, the pairs are {8, 12}, {8, 4}, {16, 12}, {12, 16}, {4, 0}.
    Constraints:
    1 <= arr.size() <= 2*105
    1 <= k <= 2*105
    0 <= arr[i] <= 105
    
    */

//Solution

class Solution {
    int countPairs(int[] arr, int k) {
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            int diff = arr[i] - k;
            
            if(map.containsKey(diff)){
                ans += map.get(diff);
            }
            
            int sum = arr[i] + k;
            
            if(map.containsKey(sum)){
                ans += map.get(sum);
            }
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return ans;
    }
}

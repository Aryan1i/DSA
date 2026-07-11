//Problem
    
    /*You are given an array arr of integers and a list of queries. Each query consists of two indices, leftIndex and rightIndex, defining a range in the array. For each query, calculate the maximum prefix sum within the given range.
    
    A prefix sum is the sum of all elements from the start of the range up to a certain point within the range.
    
    Examples:
    
    Input: arr = [-1, 2, 3, -5], leftIndex = [0, 1], rightIndex = [3, 3]
    Output:[4, 5]
    Explanation:For the range [0, 3], the prefix sums are [-1, 1, 4, -1]. The maximum is 4. For the range [1, 3], the prefix sums are [2, 5, 0]. The maximum is 5.
    Input: arr = [1, -2, 3, 4, -5], leftIndex = [0, 2, 1], rightIndex = [4, 3, 3]
    Output: [6, 7, 5]
    Explanation: For the range [0, 4], the prefix sums are [1, -1, 2, 6, 1]. The maximum is 6. For the range [2, 3], the prefix sums are [3, 7]. The maximum is 7. For the range [1, 3], the prefix sums are [-2, 1, 5]. The maximum is 5.
    Expected Time Complexity: O(arr.size() * queries)
    Expected Auxiliary Space: O(1)
    
    Constraints:
    1 ≤ arr.size() ≤ 10^6
    -10^4 ≤ arr[i] ≤ 10^4
    1 ≤ queries ≤ 10^4
    0 ≤ leftIndex[i] ≤ rightIndex[i] < arr.size()*/

//Solution

class Solution {
    public List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,List<Integer> rightIndex) {
        int n = arr.size();
        long[] psum = new long[n];
        
        psum[0] = arr.get(0);
        
        for(int i = 1 ; i < n ; i++){
            psum[i] = psum[i - 1] + arr.get(i);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < leftIndex.size(); i++){
            int l = leftIndex.get(i);
            int r = rightIndex.get(i);
            
            long max = Integer.MIN_VALUE;
            
            long minus = (l == 0) ? 0 : psum[l - 1];
            
            for(int j = l; j <= r; j++){
                if(psum[j] - minus > max) max = psum[j] - minus;
            }
            ans.add((int)max);
        }
        
        return ans;

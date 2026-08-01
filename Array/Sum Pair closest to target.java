//Problem

    /*Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a ≤ b whose sum is closest to target.
    
    Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.
    
    Examples:
    
    Input: arr[] = [10, 30, 20, 5], target = 25
    Output: [5, 20]
    Explanation: As 5 + 20 = 25 is closest to 25.
    Input: arr[] = [5, 2, 7, 1, 4], target = 10
    Output: [2, 7]
    Explanation: As (4, 5), (2, 7) and (4, 7) both are closest to 10, but absolute difference of (4, 5) is 1, (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
    Input: arr[] = [10], target = 10
    Output: []
    Explanation: As the input array has only 1 element, return an empty array.
    Constraints:
    1 ≤ arr.size() ≤ 2*105
    0 ≤ target ≤ 2*105
    0 ≤ arr[i] ≤ 105*/

//Solution

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        int n = arr.length;
        if(n == 1) return new ArrayList<>();
        Arrays.sort(arr);
        
        int i = 0;
        int j = n - 1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int closest = Integer.MAX_VALUE;
        
        while(j > i){
            int sum = arr[i] + arr[j];
            if(Math.abs(target - sum) < closest){
                closest = Math.abs(target - sum);
                ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[j]);
            }
            
            if(sum < target){
                i++;
            } else if (sum > target){
                j--;
            } else {
                return ans;
            }
        }
        
        return ans;
    }
}

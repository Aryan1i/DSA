    //Problem
    
    /*Given an array arr[] of size n, count the number of triplets (arr[i], arr[j], arr[k]) such that:
    
    arr[i] < arr[j] < arr[k]
    i < j < k
    These triplets are called Magic Triplets.
    
    Examples :
    
    Input: arr[] = [1, 2, 3, 4]
    Output: 4
    Explanation: Fours magic triplets are (1, 2, 3), (1, 2, 4), (1, 3, 4) and (2, 3, 4).
    Input: arr[] = [3, 2, 1]
    Output: 0
    Explanation: There is no magic triplet.
    Constraints:
    1 ≤ length of array ≤ 103
    1 ≤ arr[i] ≤ 105*/

//Solution

class Solution {
    public int countTriplets(int[] nums) {
        
        int ans = 0;
        
        for(int j = 1; j < nums.length - 1; j++){
            int low = 0;
            for(int i = 0; i < j; i++){
                if(nums[i] < nums[j])low++;
            }
            
            int high = 0;
            for(int k = j + 1; k < nums.length; k++){
                if(nums[k] > nums[j])high++;
            }
            
            ans += (low * high);
        }
        
        return ans;
    }
}

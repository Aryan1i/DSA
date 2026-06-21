//Problem

    /*Given an array arr[] containing 2*n + 2 positive numbers, out of which 2*n numbers exist in pairs whereas only two number occur exactly once and are distinct. Find the other two numbers. Return the answer in increasing order.
    
    Examples:
    
    Input: arr[] = [1, 2, 3, 2, 1, 4]
    Output: [3, 4] 
    Explanation: 3 and 4 occur exactly once.
    Input: arr[] = [2, 1, 3, 2]
    Output: [1, 3]
    Explanation: 1 and 3 occur exactly once.
    Input: arr[] = [2, 1, 3, 3]
    Output: [1, 2]
    Explanation: 1 and 2 occur exactly once.
    Constraints:
    2 ≤ arr.size() ≤ 106 
    1 ≤ arr[i] ≤ 5 * 106
    arr.size() is even*/

//Solution

class Solution {
    public int[] singleNum(int[] arr) {
        int xor = 0;
        
        for(int i = 0; i < arr.length; i++){
            xor ^= arr[i];
        }
        
        int set = 0;
        
        for(int i = 0; i < 32; i++){
            if(xor % 2 == 1){
                set = i;
            }
            xor >>= 1;
        }
        
        int ans1 = 0;
        int ans2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if((arr[i] >> set) % 2 == 1){
                ans1 ^= arr[i];    
            } else {
                ans2 ^= arr[i];
            }
        }
        
        if(ans1 < ans2){
            return new int[]{ans1,ans2};
        } else {
            return new int[]{ans2,ans1};
        }
    }
}

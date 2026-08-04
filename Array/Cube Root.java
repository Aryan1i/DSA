//Problem

    /*Given a number n, find the floor of cube root of n.
    
    Examples:
    
    Input: n = 3
    Output: 1
    Explanation: Cube root of 3 is 1.442 = 1
    Input: n = 8
    Output: 2
    Explanation: Cube root of 8 is 2
    Constraints:
    1 <= n <= 105
    
    */

//Solution

class Solution {
    static int cubeRoot(int n) {
        int left = 1;
        int right = n;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            long cube = (long) mid * mid * mid;
            
            if(cube == n){
                return mid;
            } else if (cube < n){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return right;
    }
};

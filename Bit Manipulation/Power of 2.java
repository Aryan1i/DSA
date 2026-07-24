//Problem

/*Given a non-negative integer n, return true if it is a power of 2. Otherwise, return false.  

Examples

Input: n = 8
Output: true
Explanation: 8 is equal to 2 raised to 3 (23 = 8).
Input: n = 98
Output: false
Explanation: 98 cannot be obtained by any power of 2.
Input: n = 1
Output: true
Explanation: (20 = 1).
Constraints:
0 ≤ n < 109*/

class Solution {
    public static boolean isPowerofTwo(int n) {
        int c = 0;
        for(int i = 0; i < 32; i++){
            if(n % 2 == 1){
                c++;
            }
            
            n >>= 1;
        }
        
        return c == 1;
    }
}

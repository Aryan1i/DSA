//Problem

    /*Given a positive integer n, find whether the binary representation of n has only the most significant bit (MSB) and the least significant bit (LSB) set.
    
    Examples:
    
    Input: n = 9
    Output: true
    Explanation: (9)10 = (1001)2, only the first and last bits are set.
    Input: n = 15
    Output: false
    Explanation: (15)10 = (1111)2, except first and last there are other bits also which are set.
    Constraints:
    1 ≤ n ≤ 109*/

//Solution

class Solution {
    boolean areSet(int n) {
        int c = 0;
        
        if((n & 1) == 0){
            return false;
        }
        
        while(n > 0){
            if((n & 1) == 1) c++;
            n >>= 1;
        }
        
        return c <= 2;
    }
}

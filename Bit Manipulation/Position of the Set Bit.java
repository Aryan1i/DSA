//Problem
    
    /*Given an integer n, determine position of the only set bit (1) in its binary representation. The position is counted starting from 1 at the least significant bit (LSB).
    
    If n contains exactly one set bit, return its position.
    If n contains no set bits or more than one set bit, return -1.
    Examples:
    
    Input: n = 2
    Output: 2
    Explanation: 2 is represented as "10" in binary. It has only one set bit, which is at position 2.
    Input: n = 5
    Output: -1
    Explanation: 5 is represented as "101" in binary. It has two set bits; therefore, the output is -1.
    Constraints:
    0 ≤ n ≤ 108*/

//Solution

class Solution {
    public int findPosition(int n) {
        int ori = n;
        int c = 0;
        
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1) c++;
            n >>= 1;
        }
        
        if(c != 1) return -1;
        
        for(int i = 1; i <= 32; i++){
            if((ori & 1) == 1) return i;
            ori >>= 1;
        }
        
        return -1;
    }
}

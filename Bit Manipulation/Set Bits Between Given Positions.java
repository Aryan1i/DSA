//Problem

    /*Given a non-negative integer n and two integers l and r, set all the bits from position l to r (both inclusive) in the binary representation of n. Bit positions are numbered starting from 1 for the least significant bit. Return the resulting number.
    
    Examples:
    
    Input: n = 17, l = 2, r = 3
    Output: 23
    Explanation: 17 = (10001). After setting bits from position 2 to 3, the number becomes (10111) = 23.
    Input: n = 8, l = 1, r = 2
    Output: 11
    Explanation: 8 = (1000). After setting bits from position 1 to 2, the number becomes (1011) = 11.
    Constraints:
    0 ≤ n ≤ 108
    1 ≤ l ≤ r ≤ 30*/

//Solution

class Solution {
    static int setAllRangeBits(int N, int L, int R) {
        for(int i = 1; i <= 32; i++){
            if(i >= L && i <= R){
                N |= (1 << (i - 1));
            }
        }
        
        return N;
    }
};

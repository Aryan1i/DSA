//Problem

    /*Given a non-negative integer n and two integers l and r, count the number of unset bits (0s) in the binary representation of n from the lth bit to the rth bit (inclusive), where the least significant bit is considered as the 1st bit.
    
    Examples:
    
    Input: n = 42, l = 2, r = 5
    Output: 2
    Explanation: The binary representation of 42 is 101010. The bits from positions 2 to 5 are 1010, which contain 2 unset bits. 
    Input: n = 80, l = 1, r = 4
    Output: 4
    Explanation: The binary representation of 80 is 1010000. The bits from positions 1 to 4 are 0000, which contain 4 unset bits.
    Constraints:
    0 ≤ n ≤ 109
    1 ≤ l ≤ r ≤ 31
    
    */

//Solution

class Solution {
    public int countUnsetBits(int n, int l, int r) {
        int c = 0;
        int temp = l;
        while(temp-- > 1){
            n>>=1;
        }
        for(int i = l; i <= r; i++){
            if(n % 2 == 0){
                c++;
            }
            
            n >>= 1;
        }
        
        return c;
    }
}

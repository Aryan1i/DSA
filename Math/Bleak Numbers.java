//Problem

    /*Given an integer n , check whether it is Bleak or not.
    
    A number n is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x, i.e., x + countSetBits(x) is not equal to n for any non-negative number x.
    
    Return true if n is Bleak; otherwise, return false.
    
    Examples:
    
    Input: n = 4
    Output: true
    Explanation: There is no x such that x + countSetbit(x) = 4.
    Input: n = 3
    Output: false
    Explanation: 3 is not a Bleak number as 2 + countSetBit(2) = 3.
    Constraints:
    1 ≤ n ≤ 109*/

//solution

class Solution {
    public boolean isBreak(int n) {
        for(int i = n - 32; i <= n; i++){
            if(i < 0) i = 0;
            if(i + Integer.bitCount(i) == n) return false;
        }
        return true;
    }
}

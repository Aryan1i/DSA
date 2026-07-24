//Problem

    /*Given a number n. Find the length of the longest consecutive 1s in its binary representation.
    
    Examples:
    
    Input: n = 14
    Output: 3
    Explanation: Binary representation of 14 is 1110, in which 111 is the longest consecutive set bits of length is 3.
    Input: n = 222
    Output: 4
    Explanation: Binary representation of 222 is 11011110, in which 1111 is the longest consecutive set bits of length 4. 
    Constraints :
     1  ≤ n ≤ 109
    */

//Solution

class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        int c = 0;
        int max = 0;
        
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){
                c++;
            } else {
                c = 0;
            }
            max = Math.max(max, c);
            n >>= 1;
        }
        
        return max;
    }
}

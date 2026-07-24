//Problem

    /*Given a positive integer n. Return the count of set bits in its binary equivalent.
    
    Examples:
    
    Input: n = 6
    Output: 2
    Explanation: 
    
    Binary representation is '110', so the count of the set bit is 2.
    Input: n = 8
    Output: 1
    Explanation: 
    
    Binary representation is '1000', so the count of the set bit is 1.
    Input: n = 3
    Output: 2
    Explanation:
    
    Binary representation is '11', so the count of the set bit is 2.
    Constraints:
    1 ≤ n ≤ 109
    
    */

//Solution

class Solution {
    public int setBits(int n) {
        // code here
        int c = 0;
        for(int i = 0; i < 32; i++){
            if(n % 2 == 1){
                c++;
            }
            
            n >>= 1;
        }
        
        return c;
    }
}

//Problem

    /*Given a number n, return the count of digits in this number.
    
    Examples :
    
    Input: n = 1567
    Output: 4
    Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7.
    Input: n = 99999
    Output: 5
    Explanation: Number of digit in 99999 is 5
    Constraints:
    1 ≤ n ≤ 109
    
    */

//Solution

class Solution {
    public static int countDigits(int n) {
        int c = 0;
        
        while(n > 0){
            n /= 10;
            c++;
        }
        
        return c;
    }
}

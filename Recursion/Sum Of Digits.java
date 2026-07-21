//Problem
    
    /*Given a positive number n. Find the sum of all the digits of n.
    
    Examples:
    
    Input: n = 687
    Output: 21
    Explanation: Sum of 687's digits: 6 + 8 + 7 = 21
    Input: n = 12
    Output 3
    Explanation: Sum of 12's digits: 1 + 2 = 3
    Constraints:
    1 <= n <= 105*/

//Solution

class Solution {
    static int sumOfDigits(int n) {
        if(n == 0) return 0;
        return n%10 + sumOfDigits(n / 10);
    }
}

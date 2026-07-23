//Poblem
    
    /*Given an integer n, count the numbers having an odd number of factors from 1 to n (inclusive).
    
    Examples :
    
    Input: n = 5
    Output: 2
    Explanation: The numbers from 1 to 5 with an odd number of factors are 1 and 4.
    1 has 1 factor: [1]
    4 has 3 factors: [1, 2, 4]
    Hence, the count is 2.
    Input: n = 1
    Output: 1
    Explanation: 1 has exactly one factor, [1], which is odd. Therefore, the count is 1
    Constraints:
    0 ≤ n ≤ 109
    
    */

//Solution

class Solution {
    static int count(int n) {
        return (int)Math.sqrt(n);
    }
}

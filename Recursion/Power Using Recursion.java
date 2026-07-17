//Problem

/*You are given two numbers n and p. You need to find np.

Examples:

Input: n = 9, p = 9 
Output: 387420489
Explanation: 387420489 is the value obtained when 9 is raised to the power of 9.
Input: n = 2, p = 9
Output: 512
Explanation: 512 is the value obtained when 2 is raised to the power of 9.  
Constraints:
1 ≤ n ≤ 10
0 ≤  p ≤ 9

*/

//Solution

class Solution {
    static int RecursivePower(int n, int p) {
        if(p == 0) return 1;
        if(p == 1) return n;
        int half = RecursivePower(n, p/2);
        int res = half * half;
        if(p % 2 == 1) res = res * n;
        return res;
    }
}

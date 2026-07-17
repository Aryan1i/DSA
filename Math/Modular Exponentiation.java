//Problem

/*Given three integers x, n, and M, compute (x^n) % M, i.e., the remainder when x raised to the power n is divided by M.

Examples:

Input: x = 3, n = 2, M = 4
Output: 1
Explanation: 32 % 4 = 9 % 4 = 1.
Input: x = 2, n = 6, M = 10
Output: 4
Explanation: 26 % 10 = 64 % 10 = 4.
Constraints:
1 ≤ x, n, M ≤ 109

*/

class Solution {
    public int powMod(int x, int n, int M) {
        return (int) pow(x, n, M);
    }

    public long pow(int x, int n, int M) {
        if (n == 0)
            return 1;

        if (n == 1)
            return x % M;

        long half = pow(x, n / 2, M);

        long res = (half * half) % M;

        if (n % 2 == 1) {
            res = (res * (x % M)) % M;
        }

        return res;
    }
}

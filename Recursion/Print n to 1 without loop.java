//Problem

/*Print numbers from n to 1 (space separated) without the help of loops.

Examples :

Input: n = 10
Output: 10 9 8 7 6 5 4 3 2 1
Constraints :
1 ≤ n ≤ 1000

*/

class Solution {
    void printNos(int n) {
        if(n == 0) return ;
        System.out.print(n + " ");
        printNos(--n);
    }
}

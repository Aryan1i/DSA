//Problem
    
    /*Given an integer n, return all the n digit numbers in increasing order, such that their digits are in strictly increasing order(from left to right).
    
    Examples :
    
    Input: n = 1
    Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    Explanation: Single digit numbers are considered to be strictly increasing order.
    Input: n = 2
    Output: [12, 13, 14, 15, 16, 17, 18, 19, 23....79, 89]
    Explanation: For n = 2, the correct sequence is 12 13 14 15 16 17 18 19 23 and so on up to 89.
    Input: n = 15
    Output: []
    Explanation: No such number exist. 
    Constraints:
    1 ≤ n ≤ 105
    
    */

//Solution

class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(n == 1) ans.add(0);
        solve(0, 0, n, ans);
        return ans;
    }
    
    public static void solve(int i, int num, int n, ArrayList<Integer> ans){
        for(int j = 0; j < 10; j++){
            if(num % 10 < j){
                if(i + 1 == n){
                    ans.add(num * 10 + j);
                    continue;
                }
                solve(i + 1, num * 10 + j, n, ans);
            }
        }
    }
}

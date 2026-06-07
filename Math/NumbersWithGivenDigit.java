//Problem
    
    /*Given two integers n and d. Return an array containing all the numbers between 0 to n that contain the specific digit d.
    
    Examples:
    
    Input: n = 20, d = 5
    Output: [5, 15]
    Explanation: For number till 20, 5 appears in 5 itself and 15.
    Input: n = 50, d = 2
    Output: [2, 12, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 32, 42]
    Explanation: For number till 50, 2 appears in all these numbers.
    Constraints:
    0 ≤ n ≤ 103
    0 ≤ d ≤ 9*/

//Solution

class Solution {
    public Vector<Integer> solve(int n, int d) {
        Vector<Integer> ans = new Vector<>();
        
        if(d > n){
            ans.add(-1);
        }
        
        for(int i = 0; i <= n; i++){
            if(containsDigit(i,d)){
                ans.add(i);
            }
        }
        
        return ans;
    }
    
    public boolean containsDigit(int i , int d){
        if (i == 0 && d == 0) {
            return true;
        }
        while(i > 0){
            int dgt = i % 10;
            if(dgt == d){
                return true;
            }
            i/=10;
        }
        return false;
    }
}

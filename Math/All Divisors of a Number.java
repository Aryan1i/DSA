//Problem

    /*Given an integer n, return all the divisors of n in the ascending order.
     
    Examples:
    
    Input : n = 20
    Output: 1 2 4 5 10 20
    Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.
    Input: n = 21191
    Output: 1 21191
    Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself).
    Constraints:
    1 ≤ n ≤ 109*/

//Solution

class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> large = new ArrayList<>();
        
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0) {
                ans.add(i);
                
                if(i != n / i){
                    large.add(n / i);
                }
            }
            
        }
        
       for(int i = large.size() - 1; i >= 0; i--){
           ans.add(large.get(i));
       }
        
        return ans;
    }
}

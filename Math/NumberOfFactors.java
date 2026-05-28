//Problem


    /*Find the number of factors for a given integer n.
    
     Examples:
    
    Input: n = 5
    Output: 2
    Explanation: 5 has 2 factors 1 and 5
    Input: n = 25
    Output: 3
    Explanation: 25 has 3 factors 1, 5, 25 
    Constraints:
    1 ≤ n ≤ 105*/

//Solution

class Solution {
  public:
    int countFactors(int n) {
        int c = 0;
        
        for(int i =1; i * i <= n; i++){
            if(i*i == n){
                c+=1;
            } else if(n % i == 0){
                c+=2;
            }
        }
        
        return c;
    }
};

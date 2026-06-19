//Problem

    /*Given an integer n, compute the value of F(n) where F(n) is defined as: F(n)=(1)+(2×3)+(4×5×6)+(7×8×9×10)+…upto n terms. 
    
    Note: As the answer can be very large, return the answer modulo 109+7.
    
    Examples:
    
    Input: n = 5
    Output: 365527
    Explanation: F(5) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + 11*12*13*14*15 = 365527.
    Input: n = 7
    Output: 6997165
    Explanation: F(7) = 1 + 2*3 + 4*5*6 + 7*8*9*10 + 11*12*13*14*15 + 16*17*18*19*20*21 + 22*23*24*25*26*27*28 = 6006997207.
    6006997207 % 109+7 = 6997165
    Constraints:
    1 ≤ n ≤ 100*/

//Solution

class Solution {
    public int sequence(int n) {
        if(n == 1) return 1;
        
        int x = n * (n + 1) / 2;
        long ans = 1;
        
        int mod = 1000000007;
        
        int temp = n;
        while( temp > 0){
            ans = ((ans%mod) * (x%mod))%mod;
            x--;
            temp--;
        }
        
        ans = (ans + sequence(n - 1)) % mod;
        
        return (int)ans;
    }
};

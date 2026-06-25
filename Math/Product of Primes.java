//Problem

    /*Given two numbers L and R (inclusive) find the product of primes within this range. Print the product modulo 109+7. If there are no primes in that range you must print 1.
    
    Examples:
    
    Input: L = 1, R = 10
    Output: 210
    Explaination: The prime numbers are 2, 3, 5 and 7.
    Input: L = 1, R = 20
    Output: 9699690
    Explaination: The primes are 2, 3, 5, 7, 11, 13, 17 and 19.
    Constraints:
    1 ≤ L ≤ R ≤ 109
    0 ≤ (R - L) ≤ 106  */

//Solution

class Solution {
    public int primeProduct(int L, int R) { 
        
        int M = 1000000007;
        
        Boolean[] prime = new Boolean[R + 1];
        
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for(int i = 2; i <= Math.sqrt(R); i++){
            if(prime[i] == false) continue;
            for(int j = i * i; j <= R; j += i){
                prime[j] = false;
            }
        }
        
        long ans = 1;
        
        for(int i = L ; i <= R; i++){
            if(prime[i] == true){
                ans = ((ans % M) * (i % M)) % M;
            }
        }
        
        
        return (int)ans;
    }
}

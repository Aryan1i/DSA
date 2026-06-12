//Problem

    /*You are given an integer array queries[], where each element represents a query value n. For every n in the array, determine how many numbers less than or equal to n have exactly 3 divisors.
    
    Examples:
    
    Input: queries[] = [6]
    Output: [1]
    Explanation: There is only one number 4 which has exactly three divisors 1, 2 and 4 and less than equal to 6.
    Input: query[] = [3, 10]
    Output: [0, 2]
    Explanation: For query[0], the answer is 0. For query[1], there are two numbers 4 and 9 having exactly 3 divisors.
    Constraints : 
    1 ≤ q ≤ 103, where q is number of elements in the queries.
    1 ≤ queries[i] ≤ 109 */

//Solution

class Solution {
    
    static int hasThreePrimeFac(long N) {
        
        long root = (long)Math.sqrt(N);
        
        if(root * root != N)
            return 0;
        
        if(isPrime(root))
            return 1;
        
        return 0;
    }
    
    static boolean isPrime(long n){
        
        if(n < 2) return false;
        
        for(long i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
        
        return true;
    }
}

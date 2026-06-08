//Problem

    You are given a number n. You need to find the digital root of n. Digital Root of a number is the recursive sum of its digits until we get a single digit number.
    
    Examples :
    
    Input: n = 1
    Output:  1
    Explanation: Digital root of 1 is 1
    Input: n = 99999
    Output: 9
    Explanation: Sum of digits of 99999 is 45 which is not a single digit number, hence sum of digit of 45 is 9 which is a single digit number.
    Constraints:
    1 ≤ n ≤ 107

//Solution

class Solution {
    static int digitalRoot(int N) {
        int ans = sumDigit(N);
        while(ans >= 10){
            ans = sumDigit(ans);
        }
        
        return isPrime(ans);
    }
    
    static int isPrime(int n){
        if(n == 1){
            return 0;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    
    static int sumDigit (int num){
        int ans = 0;
        while(num > 0){
            int d = num % 10;
            ans += d;
            num /= 10;
        }
        return ans;
    }
}

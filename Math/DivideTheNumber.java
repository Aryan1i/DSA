//Problem
    
    /*Given a positive integer N, count the number of possible ways to represent N as the sum of four positive integers.
     
    
    Example 1:
    
    Input:
    N = 5
    Output:
    1
    Explanation:
    We can represent 5 as
    a sum of 4 positive integers,
    only in 1 way as 1+1+1+2 = 5
    Example 2:
    
    Input:
    N = 41
    Output:
    511
    Explanation:
    We can represent 41 as
    sum of 4 positive integers
    in 511 ways
    
    Your Task:
    You don't need to read input or print anything. Your task is to complete the function countWays() which takes an integer N as input parameter and returns an integer, the total count of the number of ways N can be represented as sum of 4 positive numbers.
     
    
    Expected Time Complexity: O(N4)
    Expected Space Complexity: O(1)
     
    
    Constraints:
    0 <= N <= 100*/

//Solution

class Solution {
    static long countWays(int N) {
        long ans = 0;
        for(int i = 1; i <= N ; i++){
            for(int j = i; i + j <= N ; j++){
                for(int k = j; i + j + k <= N ; k++){
                    for(int l = k; i + j + k + l <= N ; l++){
                        long val = i + j + k + l;
                        if( val  == N){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}

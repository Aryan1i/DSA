//Problem
    
    /*Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.
    
    Examples:
    
    Input: a = 5 , b = 10
    Output: [10, 5]
    Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
    Input: a = 14 , b = 8
    Output: [56, 2]
    Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
    Input: a = 1 , b = 1
    Output: [1, 1]
    Explanation: LCM of 1 and 1 is 1, while their GCD is 1.
    Constraints:
    1 ≤ a, b ≤ 104*/

//Solution

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int[] ans = new int[2];
        
        int oriA = a;
        int oriB = b;
        
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        ans[1] = a;
        
        ans[0] = (oriA * oriB) / a;
        
        return ans;
    }
}

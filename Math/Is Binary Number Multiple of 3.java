//problem
    
    /*You are given a binary number as a string of characters ('0' and '1'). Your task is to determine whether this binary number is divisible by 3. 
    Note: Try to accomplish this using a single traversal of the input binary string.
    
    Examples:
    
    Input: s = "100"
    Output: false
    Explanation: "100"'s decimal equivalent is 4, which is not divisible by 3.
    Input: s = "0011"
    Output: true
    Explanation: "0011" is 3, which is divisible by 3.
    Input: s = "110"
    Output: true
    Explanation: The decimal equivalent of "110" is 6, which is divisible by 3.
    Constraints:
    1 ≤ s.size() ≤ 106
    The string s contains only '0' and '1'.*/

//Solution

class Solution {
    boolean isDivisible(String s) {
        int rem = 0;
        for(int i = 0; i < s.length(); i++){
            int d = s.charAt(i) - '0';
            rem = (rem * 2 + d) % 3;
        }
        
        if(rem == 0){
            return true;
        } else {
            return false;
        }
    }
}

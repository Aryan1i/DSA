//Problem

    /*Given a string s consisting of distinct lowercase characters, determine its rank among all its permutations when those are arranged in lexicographically sorted order.
    
    Note: The rank of a string is its position (starting from 1) in the sorted list of all its permutations.
    
    Examples:
    
    Input: s = "abc"
    Output: 1
    Explanation: All permutations of "abc" arranged in lexicographical order are: [abc, acb, bac, bca, cab, cba]. Since "abc" appears first in this list, its rank is 1.
    Input: s = "cba"
    Output: 6
    Explanation: All permutations of "cba" arranged in lexicographical order are: [abc, acb, bac, bca, cab, cba]. Since "cba" appears at the 6th position in this list, its rank is 6.
    Input: s = "string"
    Output: 598
    Explanation: If all permutations of "string" are arranged in lexicographical order, then "string" appears at the 598th position in the list. Therefore, its rank is 598.
    Constraints:
    1 ≤ |s| ≤ 18 
    |s| denotes the length of the string s.*/

//Solution

class Solution {
    public long findRank(String s) {
        boolean[] b = new boolean[26];
        
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            b[ch - 97] = true;
        }
        
        long ans = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count = 0;
            
            for(int j = 0; j < ch - 97; j++){
                if(b[j] == true) count++;
            }
            
            b[ch - 97] = false;
            
            ans += count * factorial(s.length() - (i + 1));
        }
        
        return ans + 1;
    }
    
    public long factorial(int n){
        long fac = 1;
        
        while(n > 1){
            fac *= n--;
        }
        
        return fac;
    }
}

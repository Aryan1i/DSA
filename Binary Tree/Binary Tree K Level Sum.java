//Problem
    
    /*Given a binary tree s and a number k, find the sum of tree nodes at level k. The Binary Tree is given in string form s: (node-value(left-subtree)(right-subtree)).
    
    Examples:
    
    Input: s = "(0(5(6()())(4()(9()())))(7(1()())(3()())))", k = 2
    Output: 14
    Explanation: The Tree from the above String will be formed as:
                
    The sum of nodes at the 2nd level is 6 + 4 + 1 + 3 = 14.
    Input: s = "(4(8()9())" , k = 1
    Output: 17
    Explanation: The Tree from the above String will be formed as:
                      
    The sum of nodes at the 1st level is 8 + 9 = 17.
    Input: s = "(2)" , k = 0
    Output: 2 
    Explanation: The string "(2)" represents a binary tree with a single node having value 2. So, the sum of nodes at the 0th level is 2.
    Constraints:
    1 ≤ |s| ≤ 105
    0 ≤ k ≤ 15*/

//Solution

class Solution {
    static int kLevelSum(String s, int k) {
        int n = s.length();
        int ans = 0;
        
        int d = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                d++;
            } else if (ch == ')'){
                d--;
            } else {
                int sign = 1;
                if(ch == '-'){
                    sign = -1;
                    i++;
                }
                
                int num = 0;
    
                while(Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                
                if(d - 1 == k){
                    ans += num;
                }
            }
        }
        
        return ans;
    }
};

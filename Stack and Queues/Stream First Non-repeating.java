//Problem
    
    /*Given a string s consisting of only lowercase alphabets, for each index i in the string (0 ≤ i < n), find the first non-repeating character in the prefix s[0..i]. If no such character exists, use '#'.
    
    Examples:
    
    Input: s = "aabc"
    Output: a#bb
    Explanation: 
    At i=0 ("a"): First non-repeating character is 'a'.
    At i=1 ("aa"): No non-repeating character, so '#'.
    At i=2 ("aab"): First non-repeating character is 'b'.
    At i=3 ("aabc"): Non-repeating characters are 'b' and 'c'; 'b' appeared first, so 'b'. 
    Input: s = "bb" 
    Output: "b#" 
    Explanation: 
    At i=0 ("b"): First non-repeating character is 'b'.
    At i=1 ("bb"): No non-repeating character, so '#'.
    Constraints:
    1 ≤ s.size() ≤ 105
    
    */

//Solution

class Solution {
    public String firstNonRepeating(String s) {
        Queue<Character> q = new LinkedList<>();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        StringBuilder ans = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            if(map.get(ch) == 1){
                q.offer(ch);
            }
            
            while(!q.isEmpty() && map.get(q.peek()) > 1){
                q.remove();
            }
            
            if(q.isEmpty()){
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }
        
        return ans.toString();
    }
}

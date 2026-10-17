//Problem
    
    /*Given an array of strings words[]. Find the longest word in words[] such that every prefix of it is also present in the array words[]. 
    
    Note: If multiple strings have the same maximum length, return the lexicographically smallest one.
    
    Examples:
    
    Input: words[] = ["p", "pr", "pro", "probl", "problem", "pros", "process", "processor"]
    Output: pros
    Explanation: "pros" is the longest word with all prefixes ("p", "pr", "pro", "pros") present in the array words[].
    Input: words[] = ["ab", "a", "abc", "abd"]
    Output: abc
    Explanation: Both "abc" and "abd" has all the prefixes in words[]. Since, "abc" is lexicographically smaller than "abd", so the output is "abc".
    Constraints:
    
    1 ≤ |words| ≤ 103
    words consists only of lowercase English alphabets
    */

//Solution

class Solution {
    class Trie{
        Trie[] children = new Trie[26];
        boolean isEnd;
    }
    
    String ans = "";
    public String longestString(String[] words) {
        ans = ""; 
        int n = words.length;
        
        Trie root = new Trie();
        for(int i = 0; i < n; i++){
            Trie curr = root;
            for(char ch : words[i].toCharArray()){
                if(curr.children[ch - 'a'] == null){
                    curr.children[ch - 'a'] = new Trie();
                }
                curr = curr.children[ch - 'a'];
            }
            curr.isEnd = true;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((char) ('a' + i));
                solve(root.children[i], sb);
            }
        }
        return ans;
    }
    
    public void solve(Trie curr, StringBuilder sb){
            if (!curr.isEnd) {
                return;
            }

            if (ans.length() < sb.length() ||
                (ans.length() == sb.length() && sb.toString().compareTo(ans) < 0)) {
                ans = sb.toString();
            }

            for (int i = 0; i < 26; i++) {
                if (curr.children[i] != null) {
                    sb.append((char) ('a' + i));

                    solve(curr.children[i], sb);

                    sb.deleteCharAt(sb.length() - 1);
                }
            }
    }
}

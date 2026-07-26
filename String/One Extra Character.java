//Problem

    /*Given two strings s1 and s2, both containing the same set of characters in any order, except that one of the strings contains exactly one extra character, find and return the extra character. The characters may appear multiple times, and the order of characters in the strings is not necessarily the same.
    
    Examples:
    
    Input: s1 = "abba", s2 = "baxab"
    Output: 'x'
    Explanation: Both strings contain the characters a, b, b, and a. String s2 has one additional character x.
    Input: s1 = "aaaa", s2 = "aaa"
    Output: 'a'
    Explanation: Both strings contain the character 'a', but s1 contains it four times while s2 contains it three times. Therefore, the extra character is 'a'.
    Constraints:
    1 ≤ |s1|, |s2| ≤ 103
    | |s1| - |s2| | = 1
    Both strings contain only lowercase English letters (a-z).
    */

//Solution

class Solution {
    public char extraChar(String s1, String s2) {
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        
        for(char ch : s1.toCharArray()){
            fre1[ch - 'a']++;
        }
        
        for(char ch : s2.toCharArray()){
            fre2[ch - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(fre1[i] != fre2[i]) return (char)(97 + i);
        }
        
        return 'a';
    }
}

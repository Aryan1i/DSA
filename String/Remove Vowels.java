//Problem

/*Given a string s. Your task is to remove the vowels from the string.

Examples:

Input: s = "welcome to geeksforgeeks"
Output: "wlcm t gksfrgks"
Explanation: Vowels were ignored only consonents were returned in the same order.
Input: s = "what is your name ?"
Output: wht s yr nm ?
Constraints:
1 <= |s| <= 105
Alphabets are lower cases only*/

//Solution

class Solution {
    String removeVowels(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') ans.append(ch);
        }
        return ans.toString();
    }
}

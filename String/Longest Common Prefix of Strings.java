//Problem
    
    /*Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".
    
    Examples :
    
    Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
    Output: "gee"
    Explanation: "gee" is the longest common prefix in all the given strings.
    Input: arr[] = ["hello", "world"]
    Output: ""
    Explanation: There's no common prefix in the given strings.
    Constraints:
    1 ≤ |arr| ≤ 103
    1 ≤ |arr[i]| ≤ 103
    
    */

//Solution

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String ans = "";
        String sample = arr[0];
        
        for(int i = 0; i < sample.length(); i++){
            char ch = sample.charAt(i);
            for(int j = 0; j < arr.length; j++){
                if(arr[j].length() >= i && arr[j].charAt(i) != ch)
                    return ans;
            }
            ans += ch;
        }
        
        return ans;
    }
}

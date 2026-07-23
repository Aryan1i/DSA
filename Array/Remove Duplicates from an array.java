//Problem

    /*Given an array arr[] consisting of positive integers, return the array by removing all duplicate numbers.
    
    Example:
    
    Input: arr[] = [2, 2, 3, 3, 7, 5] 
    Output: [2, 3, 7, 5]
    Explanation: After removing the duplicates 2 and 3 we get 2 3 7 5.
    Input: arr[] = [1, 2, 3, 4, 5] 
    Output: [1, 2, 3, 4, 5]
    Explanation: There doesn't exists any duplicate element.
    Constraints:
    2≤ arr.size() ≤ 106
    1 ≤ arr[i] ≤ 109*/

//Solution

class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int ele : set){
            ans.add(ele);
        }
        
        return ans;
    }
}

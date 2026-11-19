//Problem
    
    /*Given an array arr[] of distinct positive integers, your task is to find all its subsets.
    
    Note: You can return the subsets in any order, the driver code will print them in sorted order.
    
    Examples:
    
    Input: arr[] = [1, 2, 3]
    Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
    Explanation: 
    The subsets of [1, 2, 3] in lexicographical order are:
    [], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]
    Input: arr[] = [2, 4]
    Output: [[], [2], [2, 4], [4]]
    Explanation:
    The subsets of [2, 4] in lexicographical order are:
    [], [2], [2, 4], [4]
    Constraints :
    1 ≤ arr.size() ≤ 10
    1 ≤ arr[i] ≤ 103
    */

//Solution

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        
        solve(0, arr, new ArrayList<>(), ans);
        
        return ans;
        
    }
    
    public void solve(int i, int arr[], ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans){
        if(i == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
            solve(i + 1, arr, curr, ans);
            curr.add(arr[i]);
            solve(i + 1, arr, curr, ans);
            curr.remove(curr.size() - 1);
        
    }
}

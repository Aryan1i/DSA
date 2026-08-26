//Problem
    
    /*You are given an integer array arr[ ].  The task is to find Previous Smaller Element (PSE) for every element in the array. The Previous Smaller Element (PSE) of an element x is the first element that appears to the left of x in the array and is strictly smaller than x.
    
    Note: If no such element exists, assign -1 as the PSE for that position.
    
    Examples:
    
    Input: arr[] = [1, 6, 2]
    Output: [-1, 1, 1]
    Explanation:
    For 1, there is no element on the left, so answer is -1.
    For 6, previous smaller element is 1.
    For 2, previous smaller element is 1.
    Input: arr[] = [1, 5, 0, 3, 4, 5]
    Output: [-1, 1, -1, 0, 3, 4]
    Explanation:
    For 1, no element on the left, so answer is -1.
    For 5, previous smaller element is 1.
    For 0, no element on the left smaller than 0, so answer is -1.
    For 3, previous smaller element is 0.
    For 4, previous smaller element is 3.
    For 5, previous smaller element is 4.
    Constraints:
    1 ≤ arr.size() ≤ 105
    1 ≤ arr[i] ≤ 105*/

//Solution

class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
       
        Stack<Integer> st = new Stack<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        st.push(arr[0]);
        ans.add(-1);
        
        for(int i = 1; i < arr.length; i++){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }
            st.push(arr[i]);
        }
        
        return ans;
    }
}

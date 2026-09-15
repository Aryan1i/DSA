//Problem

    /*Given an array arr[], the task is to find the sum of the maximum elements of every possible non-empty sub-arrays of the given array arr[].
    
    Note: The answer will always fit into 32 bit integer.
    
    Examples:
    
    Input: arr[] = [1, 3, 2]
    Output: 15
    Explanation: All possible non-empty subarrays of [1, 3, 2] are [1], [3], [2], [1, 3], [3, 2] and [1, 3, 2]. The maximum elements of the subarrays are 1, 3, 2, 3, 3, 3 respectively. The sum will be 15.
    Input: arr[] = [3, 1]
    Output: 7
    Explanation: All possible non-empty subarrays of [3, 1] are [3], [1] and [3, 1]. The maximum elements of the subarrays are 3, 1, 3 respectively. The sum will be 7.
    Input: arr[] = [8, 0, 1]
    Output: 26
    Explanation: All possible non-empty subarrays of [8, 0, 1] are [8], [0], [1], [8, 0], [0, 1] and [8, 0, 1]. The maximum elements of the subarrays are 8, 0, 1, 8, 1, 8 respectively. The sum will be 26.
    Constraints:
    
    1 ≤ arr.size() ≤ 104
    0 ≤ arr[i] ≤ 109*/

//Solution

class Solution {
    public int sumOfMax(int[] arr) {
        // code here
        int n = arr.length;

        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            pge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        int[] nge = new int[n];
        st = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }

            nge[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        long ans = 0;

        for(int i = 0; i < n; i++){
            long left = i - pge[i];
            long right = nge[i] - i;

            long contribution = left * right * arr[i];

            ans = (ans + contribution);
        }

        return (int)ans;
    }
}

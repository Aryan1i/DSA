//Problem

    /*Given an array arr[] of integers and a list of q queries queries[][], where each query is in the form [L, R], compute the sum of elements from index L to R (both inclusive) for each query.
    
    Examples:
    
    Input: arr[] = [2, 4, 6, 8, 10], queries[][] = [[1, 3], [0, 2]]
    Output: [18, 12]
    Explanation:
    Query [1, 3] -> 4 + 6 + 8 = 18
    Query [0, 2] -> 2 + 4 + 6 = 12
    Input: arr[] = [5, 1, 3, 2], queries[][] = [[0, 1], [2, 3]]
    Output: [6, 5]
    Explanation:
    Query [0, 1] -> 5 + 1 = 6
    Query [2, 3] -> 3 + 2 = 5
    
    Constraints:
    
    1 ≤ arr.size() ≤ 105
    -104 ≤ arr[i] ≤ 104
    1 ≤ q ≤ 105
    0 ≤ queries[i][j]
    queries.rows ≤ q*/

//Solution

class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Answer each query
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            
            if (l == 0) {
                ans.add(prefix[r]);
            } else {
                ans.add(prefix[r] - prefix[l - 1]);
            }
        }
        
        return ans;
    }
}

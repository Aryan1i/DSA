//Problem

    /*Given three integer arrays a[], b[] and c[] of equal size n, find a triplet (one element from each array) that minimizes the difference between its maximum and minimum elements. If there is a tie, return the triplet with the smallest sum. The final triplet must be returned in descending order.
    
    Examples:
    
    Input: a[] = [5, 2, 8] , b[] = [10, 7, 12] , c[] = [9, 14, 6]
    Output: [7, 6, 5]
    Explanation: The triplet [5, 7, 6]  has difference (maximum - minimum)= (7 - 5) = 2 which is minimum of all triplets.  
    Input: a[] = [15, 12, 18, 9] , b[] = [10, 17, 13, 8] , c[] = [14, 16, 11, 5]
    Output: [11, 10, 9]
    Explanation:  Multiple triplets have the same minimum difference, and among them [11, 10, 9] has the smallest sum, so it is chosen.
    Constraints:
    1 ≤ a.size(), b.size(), c.size() ≤ 105
    1 ≤ a[i], b[i], c[i] ≤ 105*/

//Solution

class Solution {
    ArrayList<Integer> smallestDiff(int a[], int b[], int c[]) {
        int n = a.length;
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        int minDiff = Integer.MAX_VALUE;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(i < n && j < n && k < n){
            int min = Math.min(a[i], Math.min(b[j], c[k]));
            int max = Math.max(a[i], Math.max(b[j], c[k]));
            
            int diff = max - min;
            
            if(diff < minDiff){
                ans = new ArrayList<>();
                ans.add(a[i]);
                ans.add(b[j]);
                ans.add(c[k]);
                minDiff = diff;
            }
            
            if(a[i] == min) i++;
            else if (b[j] == min) j++;
            else k++;
        }
        
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}

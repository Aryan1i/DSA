    //Problem
    
    /*Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both the arrays. The intersection should not have duplicate elements and the result may contain elements in any order.
    
    Note: The driver code will sort the resulting array in increasing order before printing.
    
    Examples:
    
    Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
    Output: [1, 3]
    Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.
    Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1]
    Output: [1]
    Explanation: 1 is the only common element present in both the arrays.
    Input: a[] = [1, 2, 3], b[] = [4, 5, 6]
    Output: []
    Explanation: No common element in both the arrays.
    
    Constraints:
    
    1 ≤ a.size() ≤ 105
    0 ≤ a[i] ≤ 105
    1 ≤ b.size() ≤ 105
    0 ≤ b[i] ≤ 105
    */

//Solution

class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        HashSet set = new HashSet<>();
        
        while(i < a.length &&  j < b.length){
            if(a[i] < b[j]){
                i++;
            } else if( a[i] > b[j] ){
                j++;
            } else {
                if(!set.contains(a[i])) ans.add(a[i]);
                set.add(a[i]);
                i++;
                j++;
            }
        }
        
        return ans;
    }
}

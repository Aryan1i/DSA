//Problem

    /*Given two different unsorted arrays a[ ] and b[ ], the task is to merge the two unsorted arrays and return a sorted array.
    
    Examples:
    
    Input: a[] = [10, 5, 15], b[] = [20, 3, 2]
    Output: [2, 3, 5, 10, 15, 20]
    Explanation: After merging both the array's and sorting it, we get the above output.  
    Input: a[] = [1, 10, 5, 15], b[] = [20, 0, 2]
    Output: [0, 1, 2, 5, 10, 15, 20]
    Explanation: After merging both the array's and sorting it, we get the above output.  
    Constraints:
    1 ≤ a.size(), b.size()≤ 105
    -105 ≤ a[i], b[i]≤ 105
    
    */

//Solution

class Solution {
    public void sortedMerge(int[] arr1, int[] arr2, int[] res) {
        int n = arr1.length;
        int m = arr2.length;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0, j = 0, k = 0;
        
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }
        
        while(i < n){
            res[k++] = arr1[i++];
        }
        
        while(j < m){
            res[k++] = arr2[j++];
        }
        
        return ;
    }
}

//Problem


    /*Given an integer array of which both the first halve and second halve are sorted. The task is to merge these two sorted halves of the array into a single sorted array.
    Note: The two halves can be of arbitrary sizes (i.e. if first halve of size k then the second halve is of size n-k where 0 ≤ k ≤ n) , where n is the length of array .
    
    Examples:
    
    Input: arr[] = {2 3 8 -1 7 10}
    Output: [-1, 2, 3, 7, 8, 10] 
    Explanation: {2 3 8} and {-1 7 10} are sorted in the original array. The overall sorted version is {-1 2 3 7 8 10}
    Input: arr[] = {-4 6 9 -1 3}
    Output: [-4, -1, 3, 6, 9]
    Explanation: {-4 -1} and {3 6 9} are sorted in the original array. The overall sorted version is {-4 -1 3 6 9}
    
    Constraints:
    
    1 ≤ arr.size() ≤ 106
    -105 ≤ arr[i] ≤ 105*/

//Solution

class Solution {
    public void mergeTwoSortedArray(int[] arr) {
        int n = arr.length;
        int mid = (n + 1) / 2;

        int[] temp = new int[n];

        int i = 0; 
        int j = mid;
        int k = 0;

        while (i < mid && j < n) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j < n) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }
}

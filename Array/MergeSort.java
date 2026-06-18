//Problem
    
    /*Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.
    
    Examples:
    
    Input: arr[] = [4, 1, 3, 9, 7]
    Output: [1, 3, 4, 7, 9]
    Explanation: We get the sorted array after using merge sort
    Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Explanation: We get the sorted array after using merge sort 
    Constraints:
    1 ≤ arr.size() ≤ 105
    1 ≤ arr[i] ≤ 105*/

//Solution

class Solution {

    void mergeSort(int arr[], int l, int r) {
        
        if( l == r ) return;
        
        int mid = (l + r) / 2;
        
        mergeSort(arr, l , mid);
        mergeSort(arr, mid + 1, r);
        
        merge(arr, l , mid, r);
    }
    
    void merge(int arr[], int left, int mid, int right){
        int n = mid - left + 1;
        int m = right - mid;
        
        int[] l = new int[n];
        int[] r = new int[m];
        
        for(int i = 0; i < n; i++){
            l[i] = arr[left + i];
        }
        
        for(int i = 0; i < m; i++){
            r[i] = arr[mid + 1 + i];
        }
        
        int i = 0, j = 0, k = left;
        
        while(i < n && j < m){
            if(l[i] < r[j]){
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        
        while(i < n){
            arr[k++] = l[i++];
        }
        
        while(j < m){
            arr[k++] = r[j++];
        }
        
        
    }
}

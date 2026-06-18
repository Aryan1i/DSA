//Problem

    /*Given an array of integers arr[]. You have to find the Inversion Count of the array. 
    Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
    
    Examples:
    
    Input: arr[] = [2, 4, 1, 3, 5]
    Output: 3
    Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
    Input: arr[] = [2, 3, 4, 5, 6]
    Output: 0
    Explanation: As the sequence is already sorted so there is no inversion count.
    Input: arr[] = [10, 10, 10]
    Output: 0
    Explanation: As all the elements of array are same, so there is no inversion count.
    Constraints:
    1 ≤ arr.size() ≤ 105
    1 ≤ arr[i] ≤ 104*/

//Solution

class Solution {
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0 , arr.length - 1);
    }
    
    static int mergeSort(int[] arr,int left , int right){
        if(left == right) return 0;
        int count = 0;
        
        int mid = (left + right) / 2;
        count += mergeSort(arr, left, mid);
        count += mergeSort(arr, mid + 1, right);
        
        count += merge(arr, left, mid, right);
        
        return count;
    }
    
    static int merge(int[] arr, int left, int mid, int right){
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
        int invc = 0;
        
        while(i < n && j < m){
            if(l[i] <= r[j]){
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
                invc += n - i;
            }
        }
        
        while(i < n){
            arr[k++] = l[i++];
        }
        
        while(j <m){
            arr[k++] = r[j++];
        }
        
        return invc;
    }
}

//Problem

    /*Given an array arr[] and positive integer k, count total number of pairs in the array whose sum is divisible by k.
    
    Examples:
    
    Input :  arr[] = [2, 2, 1, 7, 5, 3], k = 4
    Output : 5
    Explanation : There are five pairs possible whose sum is divisible by '4' i.e., (2, 2), (1, 7), (7, 5), (1, 3) and (5, 3).
    Input : arr[] = [5, 9, 36, 74, 52, 31, 42], k = 3
    Output : 7 
    Explanation : There are seven pairs whose sum is divisible by 3, i.e, (9, 36), (9,42), (74, 52), (36, 42), (74, 31), (31, 5) and (5, 52).
    Constraints :
    1 ≤ |arr| ≤ 5*104
    1 ≤ arr[i] ≤ 106
    1 ≤ k ≤ 5*104
    */


class Solution {
    public int countKdivPairs(int[] arr, int k) {
        int n = arr.length;
        
        int[] fre = new int[k];
        
        for(int i = 0; i < n; i++){
            int rem = arr[i] % k;
            
            fre[rem]++;
        }
        
        int ans = 0;
        
        int left = 1;
        int right = k - 1;
        
        while(left < right){
            if(fre[left] != 0 && fre[right] != 0){
                ans += fre[left] * fre[right];
            }
            
            left++;
            right--;
        }
        
        ans += fre[0] * (fre[0] - 1) / 2;
        
        if(k % 2 == 0){
            ans += fre[k / 2] * (fre[k / 2] - 1) / 2;
        }
        
        return ans;
    }
}

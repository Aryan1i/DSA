//Problem
    
    /*You are given an integer target and an array arr[]. You need to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
    
    Note:  Pairs should have elements of distinct indexes. 
    
    Examples :
    
    Input: arr[] = [-1, 1, 5, 5, 7], target = 6
    Output: 3
    Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
    Input: arr[] = [1, 1, 1, 1], target = 2
    Output: 6
    Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
    Input: arr[] = [-1, 10, 10, 12, 15], target = 125
    Output: 0
    Explanation: There is no such pair which sums up to 125.
    Constraints:
    -105 <= target <=105
     2 <= arr.size() <= 105
    -105 <= arr[i] <= 105*/

//Solution

class Solution {
    int countPairs(int arr[], int target) {
        int i = 0;
        int j = arr.length - 1;
        
        int ans = 0;
        
        while(j > i){
            if(arr[i] + arr[j] == target){
                 if(arr[i] == arr[j]){
                     int n = j - i + 1;
                     ans += (n * (n - 1)) / 2;
                     break;
                 } else {
                     int n1 = 1;
                     int n2 = 1;
                     while(j > i && arr[i] == arr[i + 1]) {
                         n1++;
                         i++;
                     }
                     while(j > i && arr[j] == arr[j - 1]){
                         n2++;
                         j--;
                     }
                     ans += n1 * n2;
                 }
                 i++;
                 j--;
            }
            else if(arr[i] + arr[j] < target) i++;
            else if(arr[i] + arr[j] > target) j--;
        }
        
        return ans;
    }
}

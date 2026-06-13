//Problem
    
    /*You are given an array arr[] having unique elements. Your task is to return the type of array described below.
    
    Return 1 if the array is in ascending order. 
    Return 2 if the array is in descending order
    Return 3 if the array is in descending rotated order
    Return 4 if the array is in ascending rotated order
    You may assume that the input array is always one of the four types.
    
    Examples:
    
    Input: arr[] = [2, 1, 5, 4, 3]
    Output: 3
    Explanation: Descending rotated, rotate 2 times left.
    Input: arr[] = [3, 4, 5, 1, 2]
    Output: 4
    Explanation: Ascending rotated, rotate 2 times right. 
    Constraints:
    3 ≤ arr.size() ≤ 105
    1 ≤ arr[i] ≤ 106*/

//Solution

class Solution {
    int maxNtype(int arr[]) {
        // code here
        int a = 0;
        int d = 0;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]){
                a = - 1;
            }
            if(arr[i - 1] < arr[i]){
                d = - 1;
            }
        }
        
        if(a == 0) return 1;
        if(d == 0) return 2;
        if(arr[0]<arr[arr.length-1]) return 3;
        else return 4;
    }
}

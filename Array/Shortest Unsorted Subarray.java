//Problem

    /*Given an array arr of distinct numbers. Find the length of the shortest unordered (neither increasing nor decreasing) subarray in the given array. If there is no subarray then return 0.
    
    Examples:
    
    Input: arr[] = [7, 9, 10, 8, 11]
    Output: 3
    Explanation: Shortest unsorted subarray is 9, 10, 8 which is of 3 elements.
    Input: arr[] = [1, 2, 3, 5]
    Output: 0
    Explanation: There is no unsorted subarray.
    Constraints:
    1 <= arr.size() <= 106
    1 <= arr[i] <= 105*/

//Solution

class Solution {
    public int shortestUnorderedSubarray(int arr[]) {
        if(arr.length < 3){
            return 0;
        }
        
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) return 3;
            if(arr[i - 1] > arr[i] && arr[i + 1] > arr[i]) return 3;
        }
        
        return 0;
    }
}

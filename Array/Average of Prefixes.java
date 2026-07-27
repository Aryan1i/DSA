//Problem

/*Given an array arr, find the floor of average of the prefix array at every index. 

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: [10, 15, 20, 25, 30] 
Explanation: 10 / 1 = 10, (10 + 20) / 2 = 15, (10 + 20 + 30) / 3 = 20 and so on.
Input: arr[] = [12, 1]
Output: [12, 6] 
Constraints:
1 ≤ arr.size ≤ 105
1 ≤ arr[i] ≤ 106*/

//Solution

class Solution {
    public int[] prefixAvg(int[] arr) {
        int[] pre = new int[arr.length];
        
        long temp = 0;
        for(int i = 0; i < arr.length; i++){
            temp += arr[i];
            pre[i] =(int) temp/(i + 1);
        }
        
        return pre;
    }
}

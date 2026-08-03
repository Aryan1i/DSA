//Problem
    
    /*Given a sorted array arr[] of positive integers. The task is to find the closest value in the array to the given number k. The array may contain duplicate values.
    Note: If the difference with k is the same for two values in the array return the greater value.
    
    Examples :
    
    Input:  arr[] = [1, 3, 6, 7], k = 4
    Output: 3
    Explanation: We have array arr={1, 3, 6, 7} and target is 4. If we look at the absolute difference of target with every element of the array we will get { |1-4|, |3-4|, |6-4|, |7-4| }  = {3, 1, 2, 3}. So, the closest number is 3.
    Input: arr[] = [1, 2, 3, 5, 6, 8, 9], k = 4
    Output: 5
    Explanation: The absolute difference of 4 is 1 from both 3 and 5. According to the question, we have to return greater value, which is 5.
    Input: arr[] = [6, 8, 8, 8, 9, 11, 13, 13, 15, 18, 19], k = 10
    Output: 11
    Constraints:
    1 ≤ arr.size() ≤ 106
    1 ≤ k ≤ 109
    1 ≤ arr[i] ≤ 109*/

//Solution


class Solution {
    public static int findClosest(int[] arr, int k) {
        int ans = 0;
        
        int left = 0;
        int right = arr.length - 1;
        
        int diff = Integer.MAX_VALUE;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            int d = Math.abs(arr[mid] - k);
            
            if(arr[mid] == k){
                return k;
            } else if(arr[mid] < k){
                if(d < diff){
                    diff = d;
                    ans = arr[mid];
                }
                left = mid + 1;
            }else {
                if(d <= diff){
                    diff = d;
                    ans = arr[mid];
                }
                right = mid - 1;
            }
        }
        
        return ans;
    }
}

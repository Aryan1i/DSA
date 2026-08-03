//Problem

    /*Given a sorted array arr[] that represents an Arithmetic Progression (AP) with exactly one missing element, find the missing number.
    The array arr[] is sorted in either ascending or descending order.
    
    Note: An element will always exist that, upon inserting into a sequence forms Arithmetic progression. If the given sequence already forms a valid complete AP, return the (n+1)-th element that would come next in the sequence.
    
    Examples:
    
    Input: arr[] = [2, 4, 8, 10, 12, 14]
    Output: 6
    Explanation: Actual AP should be 2, 4, 6, 8, 10, 12, 14.
    Input: arr[] = [1, 6, 11, 16, 21, 31]
    Output: 26
    Explanation: Actual AP should be 1, 6, 11, 16, 21, 26, 31.
    Input: arr[] = [4, 7, 10, 13, 16]
    Output: 19
    Explanation: Since the sequence already forms a valid AP, the next element after 16 in the sequence would be 19. Therefore, the output is 19.
    Constraints:
    2 ≤ arr.size() ≤ 105
    0 ≤ arr[i] ≤ 2*107*/

//Solution

class Solution {
    public int findMissing(int[] arr) {
        int n = arr.length;
        
        int a = arr[0];
        
        int d1 = arr[1] - arr[0];
        if(n == 2) return a + (n)*d1;
        
        int d2 = arr[2] - arr[1];
        
        int d;
        if(d1 == d2){
            d = d1;
        } else {
            if(Math.abs(d1) < Math.abs(d2)) d = d1;
            else d = d2;
        }
        
        int ans = a + n * d;
        
        for(int i = 0; i < n; i++){
            if(a != arr[i]){
                ans = a;
                break;
            }
            
            a = a + d;
        }
        
        return ans;
    }
}

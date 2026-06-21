//Problem

    /*Given an array of integers arr[] where, every element appears thrice except for one which occurs once.
    Find that element which occurs once.
    
    Examples:
    
    Input: arr[] = [1, 10, 1, 1]
    Output: 10
    Explanation: 10 occurs once in the array while the other element 1 occurs thrice.
    Input: arr[] = [3, 2, 1, 34, 34, 1, 2, 34, 2, 1]
    Output: 3
    Explanation: All elements except 3 occurs thrice in the array.
    Constraints:
    1 ≤ arr.size() ≤ 105
    arr.size() % 3 = 1
    -109 ≤ arr[i] ≤ 109*/

//Solution

class Solution {
    public int getSingle(int[] arr) {
        int[] fre = new int[32];
        
        for(int ele : arr){
            for(int i = 0; i < 32; i++){
                if((ele & 1) == 1){
                    fre[i]++;
                }
                ele >>= 1;
            }
        }
        
        int ans = 0;
        
        for(int i = 0; i < 32; i++){
            if(fre[i] % 3 != 0){
                ans |= (1 << i);
            }
        }
        
        
        return ans;
    }
}

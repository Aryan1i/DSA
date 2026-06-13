//Problem

    /*Given an array arr[] of positive integers. Find out the maximum perimeter of the triangle from the array.
    
    Examples:
    
    Input: arr[] = [6, 1, 6, 5, 8, 4]
    Output: 20
    Explanation: Triangle formed by  8,6 & 6. Thus perimeter 20.
    Input: arr[] = [7, 55, 20, 1, 4, 33, 12]
    Output:  -1
    Explanation:As the triangle is not possible because the condition: the sum of two sides should be greater than third is not fulfilled here.
    Constraints:
    1 ≤ arr.size() ≤ 106
    1 ≤ arr[i] ≤105*/

//Solution

class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        for(int i = arr.length - 1; i >= 0 ; i--){
            for(int j = i - 1; j >= 0; j--){
                for(int k = j -1; k >= 0; k--){
                    if(arr[j] + arr [k] > arr[i]){
                        return arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }
        return -1;
    }
}

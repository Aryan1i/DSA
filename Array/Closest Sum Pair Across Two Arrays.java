//Problem

    /*Given two sorted arrays arr1[] and arr2[] of size n and m and a number x, find the pair whose sum is closest to x and the pair has an element from each array. In the case of multiple closest pairs return any one of them.
    
    Note : In the driver code, the absolute difference between the sum of the closest pair and x is printed.
    
    Examples:
    
    Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 32
    Output : [1, 30]
    Explanation:The closest pair whose sum is closest to 32 is [1, 30] = 31.
    Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 50 
    Output : [7, 40] 
    Explanation: The closest pair whose sum is closest to 50 is [7, 40] = 47.
    Constraints:
    1 ≤ arr1.size(), arr2.size() ≤ 105
    1 ≤ arr1[i], arr2[i] ≤ 109
    1 ≤ x ≤ 109*/

//Solution

class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        
        int i = 0;
        int j = arr2.length - 1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int closest = Integer.MAX_VALUE;
        
        while( i < arr1.length && j >= 0){
            int sum = arr1[i] + arr2[j];
            
            int diff = Math.abs(sum - x);
            
            if(diff < closest){
                ans = new ArrayList<>();
                ans.add(arr1[i]);
                ans.add(arr2[j]);
                closest = diff;
            }
            
            if(sum < x){
                i++;
            } else if (sum > x){
                j--;
            } else {
                break;
            }
        }
        
        return ans;
    }
}

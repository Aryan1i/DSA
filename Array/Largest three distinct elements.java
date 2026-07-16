    //Problem
    
    /*You are given an array arr[], you need to find the top three largest distinct integers present in the array and return an array of size three in descending order.
    
    Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.
    
    Examples:
    
    Input: arr[] = [10, 4, 3, 50, 23, 90, 90]
    Output: [90, 50, 23]
    Explanation: Since 90 appears two times in the given array, hence it is only counted once. Therefore, the top 3 distinct largest numbers are 90, 50 and 23.
    Input: arr[] = [10, 10, 10]
    Output: [10]
    Explanation: Since there is only one distinct element, hence the answer is 10.
    Input: arr[] = [6, 8, 9, 2, 1, 10]
    Output: [10, 9, 8]
    
    Constraints:
    
    1 ≤ arr.size() ≤ 105
    0 ≤ arr[i] ≤ 105*/

//Solution

class Solution {
    public int[] getThreeLargest(int arr[]) {

        Arrays.sort(arr);
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(set.size() < 3){
                set.add(arr[i]);
            } else {
                break;
            }
        }
        
        int[] ans = new int[set.size()];
        int i = 0;
        
        for(int ele : set){
            ans[i++] = ele;
        }
        
        Arrays.sort(ans);
        
        i = 0;
        int j = ans.length - 1;

        while (i <= j) {
            int temp = ans[i];
            ans[i] = ans[j];
            ans[j] = temp;
            i++;
            j--;
        }
        
        return ans;
    }
}

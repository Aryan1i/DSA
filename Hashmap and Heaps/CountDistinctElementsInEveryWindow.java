//Prblem

    /*Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array.
    
    Examples:
    
    Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
    Output: [3, 4, 4, 3]
    Explanation:
    First window is [1, 2, 1, 3], count of distinct numbers is 3.
    Second window is [2, 1, 3, 4] count of distinct numbers is 4.
    Third window is [1, 3, 4, 2] count of distinct numbers is 4.
    Fourth window is [3, 4, 2, 3] count of distinct numbers is 3.
    Input: arr[] = [4, 1, 1], k = 2
    Output: [2, 1]
    Explanation:
    First window is [4, 1], count of distinct numbers is 2.
    Second window is [1, 1], count of distinct numbers is 1.
    Input: arr[] = [1, 1, 1, 1, 1], k = 3
    Output: [1, 1, 1]
    Explanation: Every window of size 3 in the array [1, 1, 1, 1, 1], contains only the element 1, so the number of distinct elements in each window is 1.
    Constraints:
    1 ≤ k ≤ arr.size() ≤ 105
    1 ≤ arr[i] ≤ 105*/


//Solution

    class Solution {
        ArrayList<Integer> countDistinct(int arr[], int k) {
            int n = arr.length;
            int[] ans = new int[n - k + 1];
            
            
            HashMap<Integer,Integer> map = new HashMap<>();
            
            for(int i = 0; i < k; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            
            ans[0] = map.size();
            
            for(int i = 1; i < n - k + 1; i++){
                map.put(arr[i+k-1], map.getOrDefault(arr[i + k - 1], 0) + 1);
                
                map.put(arr[i-1], map.getOrDefault(arr[i - 1], 0) - 1);
                
                if(map.get(arr[i-1]) == 0) map.remove(arr[i-1]);
                
                ans[i] = map.size();
            }
            
            ArrayList<Integer> list = new ArrayList<>();
    
            for (int num : ans) {
                list.add(num);
            }
            
            return list;
        }
    }

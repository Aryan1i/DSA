//Problem
    
    /*Given an array of elements occurring in multiples of k, except one element which doesn't occur in multiple of k. Return the unique element.
    
    Examples:
    
    Input: k = 3, arr[] = [6, 2, 5, 2, 2, 6, 6]
    Output: 5
    Explanation: Every element appears 3 times except 5.
    Input: k = 4, arr[] = [2, 2, 2, 10, 2]
    Output: 10
    Explanation: Every element appears 4 times except 10.
    Expected Time Complexity: O(n* log(arr[i]))
    Expected Auxiliary Space: O(log(arr[i]))
    
    Constraints:
    3<= arr.size()<=2*105
    2<= k<=2*105
    1<= arr[i]<=109*/

//Solution

class Solution {
    public int findUnique(int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) % k != 0) return key;
        }
        
        return 0;
    }
}

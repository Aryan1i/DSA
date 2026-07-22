//Problem
    
    /*Given an array, the task is to find the difference between the highest occurrence and lowest occurrence of any numbers in an array. If only one type of element is present in the array return 0
    
    Examples:
    
    Input: arr[] = [1, 2, 2]
    Output: 1
    Explanation:  Lowest occurring element (1) occurs once. Highest occurring element (2) occurs 2 times
    Input: arr[] = [7, 8, 4, 5, 4, 1, 1, 7, 7, 2, 5]
    Output: 2
    Explanation : Lowest occurring element (2) occurs once. Highest occurring element (7) occurs 3 times
    Constraints:
    1<= arr.size() <=106
    1<= arr[i] <=106
    
    */

//Solution

class Solution {
    public int findDiff(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        if(map.size() <= 1) return 0;
        
        for(int key : map.keySet()){
            if(map.get(key) < min){
                min = map.get(key);
            }
            
            if(map.get(key) > max){
                max = map.get(key);
            }
        }
        
        return max - min;
    }
}

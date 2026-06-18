//Problem

    /*Given two arrays arr1[] and arr2[], return the merged array in ascending order containing unique elements.
    
    Examples:
    
    Input: arr1[] = [11, 1, 8], arr2[] = [10, 11]
    Output: [1, 8, 10, 11]
    Explanation: The ouput array after merging both the arrays and removing duplicates is [1, 8, 10, 11]
    Input: arr1[] = [7, 1, 5, 3, 9], arr2[]  = [8, 4, 3, 5, 2, 6]
    Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] 
    Constraints:
    1 ≤ arr1.size(), arr2.size() ≤ 104
    0 ≤ arr1[i], arr2[i] ≤ 109*/

//Solution

class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = arr1.length;
        int m = arr2.length;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            if(!set.contains(arr1[i])){
                list.add(arr1[i]);
            }
            set.add(arr1[i]);
        }
        
        for(int i = 0; i < m; i++){
            if(!set.contains(arr2[i])){
                list.add(arr2[i]);
            }
            set.add(arr2[i]);
        }
        
        Collections.sort(list);
        
        return list;
    }
}

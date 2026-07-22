//Problem

    /*Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
    
    Examples:
    
    Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
    Output: true
    Explanation: b[] is a subset of a[]
    Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
    Output: true
    Explanation: b[] is a subset of a[]
    Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
    Output: false
    Explanation: b[] is not a subset of a[]
    Constraints:
    1 <= a.size(), b.size() <= 105
    1 <= a[i], b[j] <= 106*/

//Solution


class Solution {
    public boolean isSubset(int a[], int b[]) {
        if(b.length > a.length) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> mapb = new HashMap<>();
        
        for(int i = 0; i < a.length; i++){
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        
        for(int i = 0; i < b.length; i++){
            mapb.put(b[i], mapb.getOrDefault(b[i], 0) + 1);
        }
        
        for(int key : mapb.keySet()){
            if(!map.containsKey(key)) return false;
            if(mapb.get(key) > map.get(key)) return false;
        }
        
        return true;
    }
}

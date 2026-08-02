//Problem
    
    /*Given two unsorted arrays a[]  and b[], the task is to find all pairs whose sum equals x from both arrays.
    
    Note: All pairs should be returned in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then (u1,v1) should be returned first else second.
    
    Examples:
    
    Input: target = 9, a[] = [1, 2, 4, 5, 7], b[] = [5, 6, 3, 4, 8]
    Output: 
    1 8
    4 5 
    5 4
    Explanation: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.
    Input: target = 8, a[] = [-1, -2, 4, -6, 5, 7], b[] = [6, 3, 4, 0]
    Output:
    4 4 
    5 3
    Input: target = 9, a[] = [1, 2, 4, 5, 7, 4], b[] = [5, 6, 3, 4, 8, 4]
    Output:
    1 8
    4 5
    4 5
    5 4
    5 4
    Explanation: (1, 8), (4, 5), (4, 5), (5, 4) and (5, 4) are the pairs which sum to 9.
    Constraints:
    1 ≤ arr1.size, arr2.size ≤ 105
    -2*104 ≤ target, arr1[i], arr2[i] ≤ 2*104*/

/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
       HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr2) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Arrays.sort(arr1);

        ArrayList<pair> list = new ArrayList<>();

        for (int x : arr1) {
            int need = target - x;

            if (map.containsKey(need)) {
                int freq = map.get(need);

                while (freq-- > 0) {
                    list.add(new pair(x, need));
                }
            }
        }

        return list.toArray(new pair[0]);
    }
}

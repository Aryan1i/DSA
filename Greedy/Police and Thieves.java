//Problem
    
    /*Given an array arr[], where each element contains either a 'P' for policeman or a 'T' for thief. Find the maximum number of thieves that can be caught by the police with the following conditions :
    
    Each policeman can catch only one thief.
    A policeman cannot catch a thief who is more than k units away from him.
    Examples:
    
    Input: arr[] = ['P', 'T', 'T', 'P', 'T'], k = 1
    Output: 2
    Explanation: Maximum 2 thieves can be caught. First policeman catches first thief and second police man can catch either second or third thief.
    Input: arr[] = ['T', 'T', 'P', 'P', 'T', 'P'], k = 2
    Output: 3
    Explanation: Maximum 3 thieves can be caught.
    Constraints:
    
    1 ≤ |arr| ≤ 106
    1 ≤ k ≤ 1000
    arr consists only of the characters T and P
    */

//Solution

class Solution {
    public int catchThieves(char[] arr, int k) {
        
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 'P') p.add(i);
            else t.add(i);
        }
        
        int i = 0;
        int j = 0; 
        
        int ans = 0;
        
        while(i < p.size() && j < t.size()){
            if(Math.abs(p.get(i) - t.get(j)) <= k) {
                ans++;
                i++;
                j++;
            } else if (p.get(i) < t.get(j)){
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }
}

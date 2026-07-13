//Problem

    /*You are given an array, arr[]. Find the minimum index based distance between two different elements of the array, x and y. Return -1, if either x or y does not exist in the array.
    
    Examples:
    
    Input: arr[] = [1, 2, 3, 2], x = 1, y = 2
    Output: 1
    Explanation: x = 1 and y = 2. There are two distances between x and y, which are 1 and 3 out of which the least is 1.
    Input: arr[] = [86, 39, 90, 67, 84, 66, 62], x = 42, y = 12
    Output: -1
    Explanation: x = 42 and y = 12. We return -1 as x and y don't exist in the array.
    Input: arr[] = [10, 20, 30, 40, 50], x = 10, y = 50
    Output: 4
    Explanation: The distance between x = 10 (index 0) and y = 50 (index 4) is 4, which is the only distance between them.
    Constraints:
    1 <= arr.size() <= 105
    0 <= arr[i], x, y <= 105
    x != y*/

//Solution

class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int ans = Integer.MAX_VALUE;
        ArrayList<Integer> xx = new ArrayList<>();
        ArrayList<Integer> yy = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                xx.add(i);
            }
            if(arr[i] == y){
                yy.add(i);
            }
        }
        
        if(xx.size() == 0 || yy.size() == 0) return -1;
        
        for(int ele : xx){
            for(int e : yy){
                int dif = Math.abs(ele - e);
                if( ans > dif){
                    ans = dif;
                } 
            }
        }
        return ans;
    }
}
